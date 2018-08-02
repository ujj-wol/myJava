public class CountOnes {

    public static void main(String[] args) {
        System.out.println(countOnes(9));
        System.out.println(countOnes(5));
        System.out.println(countOnes(15));
    }

    static int countOnes(int number) {
        int count=0, binaryDigit = 0;

        while (number > 0) {
            binaryDigit = number % 2;
            number /=2;
            if (binaryDigit == 1)
                count++;
        }
        return count;
    }
}
