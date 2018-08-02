public class KSmallFactors {

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(10, 20));
        System.out.println(hasKSmallFactors(6, 20));
        System.out.println(hasKSmallFactors(7, 20));
        System.out.println(hasKSmallFactors(8, 20));
        System.out.println(hasKSmallFactors(10, 22));
        System.out.println(hasKSmallFactors(7, 30));
        System.out.println(hasKSmallFactors(6, 14));
        System.out.println(hasKSmallFactors(6, 30));
    }

    static boolean hasKSmallFactors(int k, int n) {
        if (k <0 || n <0)
            return false;
        for (int factor = 1; factor < k; factor++) {
            if (n % factor == 0 && n / factor < k) {
                    return true;
            }
        }
        return false;
    }
}
