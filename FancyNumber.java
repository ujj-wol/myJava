public class FancyNumber {

    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
        System.out.println(isFancy(62));
    }

    static int isFancy(int n) {

        int fancyNumber = 1;
        int a = 1, b = 1;

        while (fancyNumber < n) {
            fancyNumber = ((a * 2) + (b * 3));
            a = b;
            b = fancyNumber;
        }
        if (fancyNumber == n) return 1;
        return 0;
    }
}
