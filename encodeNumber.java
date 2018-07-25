public class encodeNumber {

  public static void main(String[] args) {

      int[] a = encodeNumber(6936);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }

      System.out.println(" ");

      a = encodeNumber(2);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }

      System.out.println(" ");

      a = encodeNumber(6);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }

      System.out.println(" ");

      a = encodeNumber(14);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }

      System.out.println(" ");

      a = encodeNumber(24);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }

      System.out.println(" ");

      a = encodeNumber(1200);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }

  }

	public static int[] encodeNumber(int number) {
        //int i;
        int count = 0;
        int n = number;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
                n /= i;
                i--;
            }
        }
        int[] factors = new int[count];
        int c = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors[c] = i;
                c++;
                number /= i;
                i--;
            }
        }
        return factors;
    }
}
