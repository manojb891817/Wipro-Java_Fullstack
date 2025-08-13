public class WordIdentifier {

    public static String identifyPossibleWords(String input1, String input2) {
        input1 = input1.trim().toLowerCase();
        String[] words = input2.split(":");
        StringBuilder result = new StringBuilder();

        // Must contain exactly one underscore
        if (input1.chars().filter(c -> c == '_').count() != 1) {
            return "ERROR-009";
        }

        for (String word : words) {
            String trimmedWord = word.trim();
            if (trimmedWord.length() != input1.length()) {
                continue;
            }

            String wordLower = trimmedWord.toLowerCase();
            boolean match = true;

            for (int i = 0; i < input1.length(); i++) {
                if (input1.charAt(i) != '_' && input1.charAt(i) != wordLower.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(trimmedWord.toUpperCase());
            }
        }

        return result.length() > 0 ? result.toString() : "ERROR-009";
    }

    // Example usage
    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer";
        System.out.println(identifyPossibleWords(input1, input2));
    }
}