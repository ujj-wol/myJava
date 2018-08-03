public class GetExponent {
  public static void main(String[] args) {
    System.out.println(getExponent(162, 3));
    System.out.println(getExponent(27, 3));
    System.out.println(getExponent(28, 3));
    System.out.println(getExponent(280, 7));
    System.out.println(getExponent(-250, 5));
    System.out.println(getExponent(18, 1));
    System.out.println(getExponent(128, 4));
  }

  static int getExponent(int n, int p) {
    if(p <= 1) return -1;

    n = (n < 0)? -n : n;
    int power = 1, pMultiple = p;
    while(pMultiple < n) {
      if(n % pMultiple == 0) {
        pMultiple *= p;
        power++;
      }
      else {
        return power - 1;
      }
    }
    if(pMultiple == n)
      return power;
    return power - 1;
  }
}
