public class SmartNumber {

    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(8));
        System.out.println(isSmart(23));
    }

    static int isSmart1(int n) {
        int number = 1, increment = 1;
        while (number < n) {
            number += increment;
            increment++;
            if(number == n)
              return 1;
        }
        return 0;
    }

    static int isSmart(int n) {
        int index = 0;
        int element = 1;

        while (element < n) {
            element += index;
            index++;
        }

        if (element == n) return 1;
        return 0;
    }
}
