


    public class TwoSum2 {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(numbers, target);

        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {

            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1};
            }

            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[]{-1, -1};
    }
}