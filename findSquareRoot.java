public class findSquareRoot{
	public static void main(String[] args) {
		System.out.println(sqrt(24));
	}

	static double sqrt(int n) {

      if (n <= 1) {

          return n;
      }

      double  sqrt , m;
      sqrt  = n / 2;
      do {
          m = sqrt;
          sqrt = (m + (n / m)) / 2;
      } while ((m - sqrt) != 0);
      return sqrt;
  }
}
