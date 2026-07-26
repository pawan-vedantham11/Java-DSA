public class SquareRoot {

    public static void main(String[] args) {
        int x = 8;

        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {

        int start = 1;
        int end = x;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((long) mid * mid == x) {
                return mid;
            }

            if ((long) mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}