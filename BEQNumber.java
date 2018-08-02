public class BEQNumber {

    public static void main(String[] args) {
        System.out.println(findSmallestBEQNumber());
    }

    static int findSmallestBEQNumber() {
        int cube, countOf6;
        int number = 11;
        while (true) {
            cube = number * number * number;
            countOf6 = 0;

            while (cube > 0) {
                int digit = cube % 10;
                cube /= 10;
                if (digit == 6 && countOf6 <= 4)
                    countOf6++;
                else if (countOf6 > 4)
                  break;
            }
            if (countOf6 == 4) {
                return number;
            }
            number++;
        }
    }
}
