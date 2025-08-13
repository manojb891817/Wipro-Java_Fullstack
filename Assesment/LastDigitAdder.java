public class LastDigitAdder {

    // Method to add last digits of two numbers ignoring their sign
    public static int addLastDigits(int input1, int input2) {
        // Take absolute values to ignore sign
        int lastDigit1 = Math.abs(input1) % 10;
        int lastDigit2 = Math.abs(input2) % 10;

        return lastDigit1 + lastDigit2;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        System.out.println("Sum of last digits: " + addLastDigits(267, 154));    // Output: 11
        System.out.println("Sum of last digits: " + addLastDigits(267, -154));   // Output: 11
        System.out.println("Sum of last digits: " + addLastDigits(-267, 154));   // Output: 11
        System.out.println("Sum of last digits: " + addLastDigits(-267, -154));  // Output: 11
    }
}