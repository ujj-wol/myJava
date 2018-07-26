public class FactorialPrime {
  public static void main (String[] args) {
    System.out.println(isFactorialPrime (2));
    System.out.println(isFactorialPrime (3));
    System.out.println(isFactorialPrime (7));
    System.out.println(isFactorialPrime (8));
    System.out.println(isFactorialPrime (11));
    System.out.println(isFactorialPrime (721));
  }

  static int isFactorialPrime (int n) {
    if (n <= 0) return 0;
    if(! isPrime(n)) return 0;

    int factorial = 1;
    for (int i = 1; (factorial + 1) < n; i++) {
      factorial = getFactorial(i);
    }
    if (factorial + 1 == n)
      return 1;
    return 0;
  }

  static boolean isPrime (int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    // to return true when n is 2 and false when n = 1
    return (n > 1);
  }

  static int getFactorial (int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++ ) {
      fact *= i;
    }
    return fact;
  }

  // Using recursion
 /*
  static int getFactorial (int n) {
    if (n == 1 || n == 0)
      return 1;
    else return n * getFactorial(n-1);
  }
  */
}
