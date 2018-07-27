public class ClosestFibonacci {
  public static void main (String[] args) {
    System.out.println(closestFibonacci(13));
    System.out.println(closestFibonacci(33));
    System.out.println(closestFibonacci(34));
    System.out.println(closestFibonacci(1));
    System.out.println(closestFibonacci(0));
    System.out.println(closestFibonacci(54));
    System.out.println(closestFibonacci(56));
    System.out.println(closestFibonacci(2));
  }


  public static int closestFibonacci (int n) {
    if (n < 1) return 0;
    int a = 1, b = 1, fibo = 1;
    while (fibo < n) {
      a = b;
      b = fibo;
      fibo = a + b;
    }
    return (fibo == n)? fibo : b;
  }
}
