public class Triangular {
  public static void main (String[] args) {
    System.out.println(isTriangular(1));
    System.out.println(isTriangular(3));
    System.out.println(isTriangular(6));
    System.out.println(isTriangular(10));
    System.out.println(isTriangular(11));
    System.out.println(isTriangular(14));
    System.out.println(isTriangular(21));
    System.out.println(isTriangular(31));
    System.out.println(isTriangular(1100));
  }

  static int isTriangular (int n) {
    int sum = 0, num = 1;
    while (sum < n) {
      sum += num;
      num++;
    }
    if (sum == n && n != 0) return 1;
    else return 0;
  }
}
