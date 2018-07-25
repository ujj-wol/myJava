public class isPrimeHappy {
  public static void main (String[] args) {
    System.out.println(isPrimeHappy(5));

    System.out.println(isPrimeHappy(25));
    System.out.println(isPrimeHappy(32));
    System.out.println(isPrimeHappy(8));
    System.out.println(isPrimeHappy(2));
    System.out.println(isPrimeHappy(33));
    System.out.println(isPrimeHappy(-1));
  }

  public static int isPrimeHappy (int n) {
    int sumPrime = 0;
    boolean isPrime = false;

    for (int i = 2; i < n; i++) {
      isPrime = true;
      for (int j = 2; j <= i/2; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        sumPrime += i;
      }
    }
    // to test if there is atleast 1 prime below n + sumPrime % n == 0
    if (sumPrime > 0 && sumPrime % n == 0)
      return 1;
    else
      return 0;
  }
}
