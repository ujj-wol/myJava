public class isCubePowerful {
  public static void main (String[] args) {
    System.out.println(isCubePowerful(153));
    System.out.println(isCubePowerful(370));
    System.out.println(isCubePowerful(371));
    System.out.println(isCubePowerful(407));
    System.out.println(isCubePowerful(87));
    System.out.println(isCubePowerful(0));
    System.out.println(isCubePowerful(-81));
  }

  static int isCubePowerful (int n) {
    if (n <= 0)
      return 0;

    int num = n;
    int lastDigit = 0, sum = 0;
    while (n > 0) {
      lastDigit = n % 10;
      sum += (lastDigit * lastDigit * lastDigit);
      n /= 10;
    }
    if (sum == num)
      return 1;
    else
      return 0;
  }
}
