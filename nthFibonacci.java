public class nthFibonacci{
  public static void main (String[] args) {
    int a = fibo(7);
    System.out.println(a);
  }

  static int fibo (int n) {
    if (n <= 0) return -1;
    if (n == 1 || n == 2)
      return 1;
    int a = 1, b = 1, fibo = 0;
    for (int i = 3; i <= n; i++) {
      fibo = a + b;
      a= b;
      b = fibo;
    }
    return fibo;
  }
}
