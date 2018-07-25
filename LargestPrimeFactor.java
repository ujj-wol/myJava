public class LargestPrimeFactor {

  public static void main(String[] args) {

      System.out.println(largestPrimeFactor(35));
      System.out.println(largestPrimeFactor(10));
      System.out.println(largestPrimeFactor(6936));
      System.out.println(largestPrimeFactor(1));
System.out.println("");
      System.out.println(largestPrimeFactor(15));
      System.out.println(largestPrimeFactor(6936));
      System.out.println(largestPrimeFactor(1));
      System.out.println(largestPrimeFactor(35));

  }

	public static int largestPrimeFactor(int number) {
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
