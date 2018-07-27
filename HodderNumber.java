public class HodderNumber {
  public static void main (String[] args) {
    System.out.println(isHodder(2));
    System.out.println(isHodder(3));
    System.out.println(isHodder(5));
    System.out.println(isHodder(6));
    System.out.println(isHodder(7));
    System.out.println(isHodder(31));
    System.out.println(isHodder(127));
  }

  static int isHodder (int n) {
    if (n <= 1) return 0;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) return 0;
    }
    // Math.pow() gives double output
    int testVal = (int)Math.pow(2, 2) - 1;
    for (int j = 3; testVal < n; j++) {
      testVal = (int)Math.pow(2, j) - 1;
    }
    if (n == testVal) return 1;
    else return 0;
  }
}
