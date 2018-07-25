public class checkConcatenatedSum {

  public static void main(String[] args) {
    int result = checkConcatenatedSum(198, 2);
    System.out.println(result);
    result = checkConcatenatedSum(198, 3);
    System.out.println(result);
    result = checkConcatenatedSum(2997, 3);
    System.out.println(result);
    result = checkConcatenatedSum(2997, 2);
    System.out.println(result);
    result = checkConcatenatedSum(13332, 4);
    System.out.println(result);
    result = checkConcatenatedSum(9, 1);
    System.out.println(result);

  }

  static int checkConcatenatedSum(int n, int catlen) {
    int lastDigit = 0;
    int sum = 0;
    int nCopy = n;
    while (nCopy > 0) {
      lastDigit = nCopy % 10;
      int num = 0;
      for (int i = 0; i < catlen; i++) {
        num = num * 10 + lastDigit;
      }
      sum += num;
      nCopy /= 10;
    }
    if (sum == n) return 1;
    return 0;
  }
}
