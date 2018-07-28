public class _121Array {

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
        System.out.println(is121Array(new int[]{1, 2, 2, 2, 1}));
        System.out.println(is121Array(new int[]{1, 2, 2, 1, 2, 1}));
    }

    static int is121Array(int[] a) {
        if (a.length < 3 || a[0] != 1 || a[a.length - 1] != 1)
            return 0;

        int countLeft1s = 0, countRight1s = 0, count2s = 0;
        for (int i = 0; i < a.length; i++) {
          if (a[i] == 1) {
            if (count2s == 0)
              countLeft1s++;
            else
              countRight1s++;
          } else if (a[i] == 2) {
              if (countRight1s == 0)
                count2s++;
              else
                return 0;
          } else
              return 0;
        }

        if (countLeft1s == countRight1s) return 1;
        return 0;
    }
}
