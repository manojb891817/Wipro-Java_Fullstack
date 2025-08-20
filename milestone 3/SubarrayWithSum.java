
public class SubarrayWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        int currSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];

            while (currSum > target && start <= end) {
                currSum -= arr[start++];
            }

            if (currSum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No such subarray");
    }
}