// package SmartAttendanceSystem;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Attendance {

    static class LogEntry {
        String empId;
        String name;
        String action;
        LocalDateTime timestamp;

        LogEntry(String empId, String name, String action, LocalDateTime timestamp) {
            this.empId = empId;
            this.name = name;
            this.action = action;
            this.timestamp = timestamp;
        }
    }

    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\admin\\IdeaProjects\\wipro_talent_next\\src\\Smart_attendance_system\\attendance_log.txt";
        String summaryFileName = "C:\\Users\\admin\\IdeaProjects\\wipro_talent_next\\src\\Smart_attendance_system\\summary_report.txt";
        String errorFileName = "C:\\Users\\admin\\IdeaProjects\\wipro_talent_next\\src\\Smart_attendance_system\\error_report.txt";

        File inputFile = new File(inputFileName);
        File summaryFile = new File(summaryFileName);
        File errorFile = new File(errorFileName);

        // Create files if not exist
        try {
            if (!inputFile.exists() || inputFile.length() == 0) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                    writer.write("E001 John IN 2025-07-29 09:00:00\n");
                    writer.write("E001 John OUT 2025-07-29 17:30:00\n");
                    writer.write("E002 Alice IN 2025-07-29 08:45:00\n");
                    writer.write("E002 Alice OUT 2025-07-29 16:15:00\n");
                    writer.write("E003 Bob IN 2025-07-29 10:00:00\n"); // Missing OUT
                    writer.write("E003 Bob IN 2025-07-29 14:00:00\n"); // Consecutive IN
                    writer.write("E003 Bob OUT 2025-07-29 18:00:00\n");
                    System.out.println("Sample input data written to: " + inputFileName);
                }
            }
            if (!summaryFile.exists()) summaryFile.createNewFile();
            if (!errorFile.exists()) errorFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating files: " + e.getMessage());
            return;
        }

        Map<String, Map<LocalDate, List<LogEntry>>> logMap = new HashMap<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Read input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.trim().split(" ");
                if (tokens.length < 5) continue;

                String empId = tokens[0];
                String name = tokens[1];
                String action = tokens[2];
                String dateTimeStr = tokens[3] + " " + tokens[4];

                try {
                    LocalDateTime timestamp = LocalDateTime.parse(dateTimeStr, dtf);
                    LocalDate date = timestamp.toLocalDate();

                    LogEntry entry = new LogEntry(empId, name, action, timestamp);

                    logMap
                            .computeIfAbsent(empId, k -> new HashMap<>())
                            .computeIfAbsent(date, d -> new ArrayList<>())
                            .add(entry);
                } catch (Exception e) {
                    System.out.println("Invalid date format in line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Generate reports
        try (BufferedWriter summaryWriter = new BufferedWriter(new FileWriter(summaryFileName));
             BufferedWriter errorWriter = new BufferedWriter(new FileWriter(errorFileName))) {

            for (String empId : logMap.keySet()) {
                Map<LocalDate, List<LogEntry>> dailyLogs = logMap.get(empId);

                for (LocalDate date : dailyLogs.keySet()) {
                    List<LogEntry> entries = dailyLogs.get(date);
                    entries.sort(Comparator.comparing(e -> e.timestamp));

                    Duration totalDuration = Duration.ZERO;
                    boolean errorFlag = false;
                    StringBuilder errorBuilder = new StringBuilder();

                    for (int i = 0; i < entries.size(); i++) {
                        LogEntry current = entries.get(i);
                        if (!current.action.equals("IN")) {
                            errorFlag = true;
                            errorBuilder.append("Expected IN but found ")
                                    .append(current.action)
                                    .append(" at ")
                                    .append(current.timestamp)
                                    .append("\n");
                            continue;
                        }

                        if (i + 1 >= entries.size() || !entries.get(i + 1).action.equals("OUT")) {
                            errorFlag = true;
                            errorBuilder.append("Missing OUT for IN at ")
                                    .append(current.timestamp)
                                    .append("\n");
                            break;
                        }

                        LogEntry next = entries.get(i + 1);
                        if (next.timestamp.isBefore(current.timestamp)) {
                            errorFlag = true;
                            errorBuilder.append("OUT before IN for ")
                                    .append(empId)
                                    .append(" on ")
                                    .append(date)
                                    .append("\n");
                        } else {
                            Duration duration = Duration.between(current.timestamp, next.timestamp);
                            totalDuration = totalDuration.plus(duration);
                        }
                        i++; // Skip OUT
                    }

                    if (errorFlag) {
                        errorWriter.write("Employee: " + empId + ", Date: " + date + "\n");
                        errorWriter.write(errorBuilder.toString());
                        errorWriter.write("--------\n");
                    } else {
                        long hours = totalDuration.toHours();
                        long minutes = totalDuration.toMinutes() % 60;
                        summaryWriter.write(String.format("Employee: %s, Date: %s, Duration: %dh %dm\n",
                                empId, date, hours, minutes));
                    }
                }
            }

            System.out.println("Reports generated:\n" +
                    "- Summary: " + summaryFileName +
                    "\n- Errors: " + errorFileName);

        } catch (IOException e) {
            System.out.println("Error writing reports: " + e.getMessage());
        }
    }
}