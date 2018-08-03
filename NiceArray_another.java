public class NiceArray_another {

  public static void main(String[] args) {

    System.out.println(isNiceArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
    System.out.println(isNiceArray(new int[]{13, 4, 4, 4, 4}));
    System.out.println(isNiceArray(new int[]{10, 5, 5}));
    System.out.println(isNiceArray(new int[]{0, 6, 8, 20}));
    System.out.println(isNiceArray(new int[]{3}));
    System.out.println(isNiceArray(new int[]{8, 5, -5, 5, 3}));
  }


  static int isNiceArray(int[] a) {
    int sumPrime = 0;
    for(int i = 0; i < a.length; i++) {
      if(isPrime(a[i]))
        sumPrime += a[i];
    }
    if(a[0] != sumPrime)
      return 0;
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
