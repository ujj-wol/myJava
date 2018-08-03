public class DanpheArray {
  public static void main(String[] args) {
        System.out.println(isDanphe(new int[]{2, 4, 2}));
        System.out.println(isDanphe(new int[]{1, 3, 17, -5}));
        System.out.println(isDanphe(new int[]{2, 3, 5}));

        System.out.println(isDanphe_another(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(isDanphe_another(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDanphe_another(new int[]{2, 8, 7, 10, -4, 6}));
    }

  static int isDanphe (int[] a) {
    if(a.length == 0)
      return 0;

    boolean checkEven;
    if (a[0] % 2 == 0) {
      checkEven = true;
    } else {
      checkEven = false;
    }

    for(int i = 1; i < a.length; i++) {
      if (checkEven) {
        if (a[i] % 2 != 0)
          return 0;
      } else {
        if (a[i] % 2 == 0)
          return 0;
      }
    }
    return 1;
  }

  static int isDanphe_another (int[] a) {
    boolean oddFlag = false;

    for(int i = 0, j = a.length - 1; i <= j; i++, j--) {
      if((a[i] % 2 == 0 && a[j] % 2 != 0) || (a[i] % 2 != 0 && a[j] % 2 == 0))
        return 0;
      if(a[i] % 2 != 0 || a[j] % 2 != 0)
        oddFlag = true;
    }
    if(oddFlag)
      return 1;
    return 0;
  }
}
