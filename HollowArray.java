public class HollowArray {

  public static void main(String[] args) {
          System.out.println(isHollow(new int[]{1, 2, 4, 0, 0, 0, 3, 4, 5}));
          System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
          System.out.println(isHollow(new int[]{1, 2, 4, 9, 0, 0, 0, 3, 4, 5}));
          System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));

          System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
          System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
          System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
          System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
          System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
          System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
          System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
          System.out.println(isHollow(new int[]{0, 0, 0}));
          System.out.println(isHollow(new int[]{0, 0, 1, 0, 0}));
          System.out.println(isHollow(new int[]{0, 0, 1, 0, 1, 0, 0}));
      }

      static int isHollow (int[] a) {
        if(a.length < 3)
          return 0;

        int len = a.length;
        if(a[len/2] != 0 || a[len/2 + 1] != 0 || a[len/2 - 1] != 0)
          return 0;

        for(int i = 0, j = len - 1; i < j; i++, j--) {
          if((a[i] != 0 && a[j] == 0) || (a[i] == 0 && a[j] != 0))
            return 0;
        }
        return 1;
      }

  static int isHollow3 (int[] a) {
    if (a.length < 3)
      return 0;
    int nonZerosLeft = 0, nonZerosRight = 0, countZero = 0;

    int i, j;
    for (i = 0; i < a.length; i++) {
      if (a[i] != 0)
        nonZerosLeft++;
      else
        break;
    }

    for (j = a.length - 1; j >= 0; j--) {
      if (a[j] != 0)
        nonZerosRight++;
      else
        break;
    }

    if ((nonZerosLeft != nonZerosRight)) // can add this additional condition here (j - i < 2)
      return 0;

    for (int k = i; k <= j; k++) {
      if (a[k] == 0)
        countZero++;
      else return 0;
    }

    if (countZero >= 3)
      return 1;
    return 0;
  }


  static int isHollow1 (int[] a) {
    if (a.length < 3)
      return 0;
    int countZero = 0, countNonZero = 0;
    for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
      if (i == j && a[i] == 0) {
        countZero++;
        break;
      }

      if (a[i] != 0 && a[j] != 0 && countZero == 0)
        countNonZero++;
      else if (a[i] == 0 && a[j] == 0)
        countZero = countZero + 2;
      else
        return 0;
    }
    if (countZero >= 3)
      return 1;
    return 0;
  }

  static int isHollow2 (int[] a) {
    if (a.length < 3)
        return 0;
    int zeroCount = 0;

    for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
        if ((a[i] == 0 && a[j] != 0) || (a[i] != 0 && a[j] == 0)) {
            return 0;
        }
        if (i == j && a[i] == 0)
            zeroCount++;
        else if (i == j && a[i] != 0)
            return 0;
        else {
            if (a[i] == 0)
                zeroCount++;

            if (a[j] == 0)
                zeroCount++;
        }
    }

    if (zeroCount >= 3) return 1;
    return 0;
  }

}
