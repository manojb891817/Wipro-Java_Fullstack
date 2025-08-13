public class Calculator {

    // Method to calculate power with integer base and exponent
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method to calculate power with double base and integer exponent
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Main method to test the Calculator methods
    public static void main(String[] args) {
        // Testing powerInt
        int intResult = Calculator.powerInt(2, 3);
        System.out.println("2^3 = " + intResult);

        // Testing powerDouble
        double doubleResult = Calculator.powerDouble(2.5, 3);
        System.out.println("2.5^3 = " + doubleResult);
    }
}