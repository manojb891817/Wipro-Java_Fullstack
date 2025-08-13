import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    public static int minRemovalsForPalindrome(String input) {
        // Convert to lowercase to ignore case
        input = input.toLowerCase();

        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        boolean allFreqOne = true;

        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (count > 1) {
                allFreqOne = false;
            }
        }

        if (allFreqOne) {
            return -1; // All characters are unique
        } else if (oddCount <= 1) {
            return 0;  // Already suitable for palindrome
        } else {
            return oddCount - 1; // Minimum removals needed
        }
    }

    public static void main(String[] args) {
        String[] testWords = {"Template", "Magma", "Victory", "Malayalam"};

        for (String word : testWords) {
            int result = minRemovalsForPalindrome(word);
            System.out.println("Input: " + word + " → Characters to remove: " + result);
        }
    }
}