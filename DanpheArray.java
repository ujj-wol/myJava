public class DanpheArray {
  public static void main(String[] args) {
        System.out.println(isDanphe(new int[]{2, 4, 2}));
        System.out.println(isDanphe(new int[]{1, 3, 17, -5}));
        System.out.println(isDanphe(new int[]{2, 3, 5}));
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
}
