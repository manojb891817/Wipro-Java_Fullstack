// Calculator.java
public class CalculatorTest {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();

        // Test add
        int sum = calc.add(5, 3);
        System.out.println("5 + 3 = " + sum);

        // Test sub
        int diff = calc.sub(5, 3);
        System.out.println("5 - 3 = " + diff);

        // Simple validation
        if (sum == 8 && diff == 2) {
            System.out.println("All tests passed!");
        } else {
            System.out.println("Some tests failed!");
        }
    }
}
