public class ZeroBalanced {

    public static void main(String[] args) {
        System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{-3, -3, -3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
        System.out.println(isZeroBalanced(new int[]{3, -1, -2, -3, 3}));
        System.out.println(isZeroBalanced(new int[]{4, 1, -4, -1}));
    }

    static int isZeroBalanced(int[] a) {

        if (a.length <= 1)
            return 0;

        int sum = 0;
        boolean negativeFlag = false;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        if (sum != 0)
          return 0;

        for (int j = 0; j < a.length; j++) {
          if (a[j] > 0) {
            negativeFlag = false;
            for (int k = 0; k < a.length; k++) {
              if (a[j] == -a[k]) {
                a[j] = a[k] = 0;
                negativeFlag = true;
                break;
              }
            }
            if (!negativeFlag) return 0;
          }
        }
        return 1;
    }
}
