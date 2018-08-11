public class LargestPrimeFactor {

  public static void main(String[] args) {

      System.out.println(largestPrimeFactor(10));
      System.out.println(largestPrimeFactor(6936));
      System.out.println(largestPrimeFactor(1));
System.out.println("");
      System.out.println(largestPrimeFactor(35));
      System.out.println(largestPrimeFactor(49));
      System.out.println(largestPrimeFactor(6937));
      System.out.println(largestPrimeFactor(17));
      System.out.println(largestPrimeFactor(7));

  }

	public static int largestPrimeFactor(int number) {
        if (number <= 1)
          return 0;
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
}
