public class TwinArray {

  public static void main(String[] args) {
    System.out.println(isTwin(new int[]{3, 5, 8, 10, 27}));
    System.out.println(isTwin(new int[]{11, 9, 12, 13, 23}));
    System.out.println(isTwin(new int[]{5, 3, 14, 7, 18, 67}));
    System.out.println(isTwin(new int[]{13, 14, 15, 3, 5}));
    System.out.println(isTwin(new int[]{1, 17, 8, 25, 67}));
  }

  static int isTwin(int[] a) {
    for(int i = 0; i < a.length; i++) {
      if(isPrime(a[i]) && (isPrime(a[i]-2) || isPrime(a[i]+2))) {
          boolean foundTwin = false;
          for(int j = 0; j < a.length; j++) {
            if((a[j] == a[i]-2 || a[j] == a[i]+2) && isPrime(a[j])) {
              foundTwin = true;
              break;
            }
          }
          if(!foundTwin)
            return 0;
        }
      }
    return 1;
  }

  static int isTwin1(int[] a) {
    for(int i = 0; i < a.length; i++) {
      if(isPrime(a[i])) {
        boolean hasTwin = false;
        if(isPrime(a[i]-2) || isPrime(a[i]+2)) {
          hasTwin = true;
        }
        if(hasTwin) {
          boolean foundTwin = false;
          for(int j = 0; j < a.length; j++) {
            if((a[j] == a[i]-2 || a[j] == a[i]+2) && isPrime(a[j])) {
              foundTwin = true;
              break;
            }
          }
          if(!foundTwin)
            return 0;
        }
      }
    }
    return 1;
  }

  static boolean isPrime(int n) {
    for(int i = 2; i <= n/2; i++) {
      if(n % i == 0)
        return false;
    }
    return n > 1;
  }
}
