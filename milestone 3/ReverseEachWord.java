
public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println("Reversed words: " + result.toString().trim());
    }
}