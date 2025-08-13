import java.util.*;

public class JumbledWordsGame {

    public static String jumbleWord(String word, int method) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        if (method == 1) {
           
            for (int i = 0; i < word.length(); i += 2) {
                odd.append(word.charAt(i));
            }
            for (int i = (word.length() % 2 == 0 ? word.length() - 1 : word.length() - 2); i >= 0; i -= 2) {
                even.append(word.charAt(i));
            }
            return odd.toString() + even.toString();

        } else if (method == 2) {
            
            for (int i = 0; i < word.length(); i += 2) {
                odd.append(word.charAt(i));
            }
            for (int i = 1; i < word.length(); i += 2) {
                even.append(word.charAt(i));
            }
            return odd.toString() + even.toString();
        }

        return word; // default if method is invalid
    }

    public static String JumbledWords(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) result.append(" ");
            result.append(jumbleWord(words[i], input2));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter jumbled method (1 or 2):");
        int method = sc.nextInt();

        String jumbled = JumbledWords(sentence, method);
        System.out.println("Jumbled Sentence: " + jumbled);
        sc.close();
    }
}