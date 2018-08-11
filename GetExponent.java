public class GetExponent {
  public static void main(String[] args) {
    System.out.println(getExponent(162, 3));
    System.out.println(getExponent(27, 3));
    System.out.println(getExponent(28, 3));
    System.out.println(getExponent(280, 7));
    System.out.println(getExponent(-250, 5));
    System.out.println(getExponent(18, 1));
    System.out.println(getExponent(128, 4));
    System.out.println(getExponent(1, 5));
    System.out.println(getExponent(3, 5));
  }

  static int getExponent1(int n, int p) {
    if(p <= 1) return -1;
    n = (n < 0)? -n : n;
    int exp = 0;
    for (int x = 0; Math.pow(p, x) <= n; x++) {
      if(n % Math.pow(p,x) == 0)
        exp = x;
    }
    return exp;
  }

  static int getExponent(int n, int p) {
    if(p <= 1) return -1;
    n = (n < 0)? -n : n;

    int power = 0, pMultiple = 1;
    while(pMultiple < n) {
      if(n % pMultiple == 0) {
        pMultiple *= p;
        power++;
      }
      else {
        return --power;
      }
    }
    if(pMultiple == n)
      return power;
    return --power;
  }
}
