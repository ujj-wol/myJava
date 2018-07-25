public class isZeroPlentiful {
  public static void main (String[] args) {
    System.out.println(isZeroPlentiful(new int[] {0, 0, 0, 0, 0}));

    System.out.println(isZeroPlentiful(new int[] {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));

    System.out.println(isZeroPlentiful(new int[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));

    System.out.println(isZeroPlentiful(new int[] {1, 2, 3, 4}));

    System.out.println(isZeroPlentiful(new int[] {1, 0, 0, 0, 2, 0, 0, 0, 0}));

    System.out.println(isZeroPlentiful(new int[] {0}));

    System.out.println(isZeroPlentiful(new int[] {}));
  }

  static int isZeroPlentiful (int[] a) {

    int count = 0, zeroSeq = 0;

    for (int i = 0; i < a.length; i++) {
      boolean startChecking = false;

      if (a[i] == 0) {
        startChecking = true;
        count = 0;
        while (i < a.length && a[i] == 0) {
          count++;
          i++;
        }
      }
      if (startChecking) {
        if (count < 4)
          return 0;
        zeroSeq++;
      }
    }
    return zeroSeq;
  }
}
