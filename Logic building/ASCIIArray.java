public class ASCIIArray {
    public static void main(String[] args) {
        int[] arr = {65, 66, 67, 68}; // ASCII A=65, B=66, etc.
        for (int n : arr) {
            System.out.print((char)n + " ");
        }
    }
}