
public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7};
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "Array is Sorted" : "Array is NOT Sorted");
    }
}