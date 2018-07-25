public class isDigitIncreasing {
  public static void main (String[] args) {
    System.out.println(isDigitIncreasing(7));
    System.out.println(isDigitIncreasing(36));
    System.out.println(isDigitIncreasing(984));
    System.out.println(isDigitIncreasing(7404));
    System.out.println(isDigitIncreasing(23));
  }

  public static int isDigitIncreasing (int n) {
    int sum, num;
    for (int i = 1; i <= 9; i++) {
      sum = 0;
      num = 0;
      while (sum < n) {
          num = num * 10 + i;
        sum += num;
      }
      if (sum == n) {
        return 1;
      }
    }
    return 0;
  }
}
