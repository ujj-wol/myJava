public class LoopSum {

    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }

    static int loopSum(int[] a, int n) {
        int sum = 0;
        int count = 0;

        for (int i = 0; count < n; i++) {
            sum += a[i];
            count++;
            if (i == a.length - 1)
                i = -1;
        }
        return sum;
    }
}
