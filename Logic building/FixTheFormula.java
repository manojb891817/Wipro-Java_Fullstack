import java.util.*;

public class FixTheFormula {

    public static int TheFormula(String input1) {
        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(ch - '0'); 
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            }
        }

        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            int nextNum = numbers.get(i + 1);

            switch (op) {
                case '+':
                    result += nextNum;
                    break;
                case '-':
                    result -= nextNum;
                    break;
                case '*':
                    result *= nextNum;
                    break;
                case '/':
                    result /= nextNum; 
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        int answer = TheFormula(str);
        System.out.println("Final answer is: " + answer);
        sc.close();
    }
}