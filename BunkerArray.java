public class BunkerArray {

    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3}));
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21}));

    }

    static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 1 && isPrime(a[i + 1]) == 1)
                return 1;
        }
        return 0;
    }

    static int isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return 0;
        }
        return n > 1 ? 1 : 0;
    }
}
