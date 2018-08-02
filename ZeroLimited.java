public class ZeroLimited {

    public static void main(String[] args) {
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0}));
        System.out.println(isZeroLimited(new int[]{0, 1}));
        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 0, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 5, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0, 5, 5, 0, 1, 1, 0, 5, 1, 0}));
    }

    static int isZeroLimited(int[] a) {
      //int n = 0;
      //for (int x = (3 * n + 1); x < a.length; x = (3 * n + 1)) {
      for (int x = 1; x < a.length; x += 3) { // x = 3 * n + 1 = 1, 4, 7, 10, ...
        int i = 0;
        if (x > 1)
          //i = (3 * (n-1) +2);
          i = x - 2;
        for (; i <= x; i++) {
    			if (i < x && a[i] == 0)
            return 0;
          if (i == x && a[i] != 0)
            return 0;
    		}
        //n++;
      }
      return 1;
	  }

    static int isZeroLimited1(int[] a) {
      for (int x = 1; x < a.length; x += 3) { // x = 3 * n + 1 = 1, 4, 7, 10, ...
        int i = 0;
        if(x > 1)
          i = x - 2;
        for (; i <= x; i++) {
          if (i == x) {
            if (a[i] != 0)
              return 0;
          }
          if (i < x) {
            if (a[i] == 0)
                return 0;
          }
        }
      }
      return 1;
    }
}
