public class NPrimable {

    public static void main(String[] args) {
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 2));
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 3));
        System.out.println(isNPrimeable(new int[]{5, 15, 26}, 2));
        System.out.println(isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1}, 4));
        System.out.println(isNPrimeable(new int[]{}, 2));
    }

    static int isNPrimeable(int[] a, int n) {
      int number = 0;
        for (int i = 0; i < a.length; i++) {
          number = a[i] + n;
          for (int j = 2; j < number; j++) {
            if (number % j == 0)
                return 0;
          }
          if (number < 2)
            return 0;
        }
        return 1;
    }
}
