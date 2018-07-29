public class ConsecutiveFactored {

    public static void main(String[] args) {
        System.out.println(isConsecutiveFactored(20));
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));
    }

    static int isConsecutiveFactored (int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0 && n % (i + 1) == 0)
                    return 1;
            }
            return 0;
    }

    static int isConsecutiveFactored1 (int n) {
      int factor = 0;
      for (int i = 2; i <= n/2; i++) {
        if (n % i == 0)
          factor++;
        else
          factor = 0;

        if (factor == 2) {
          System.out.println("Factor of " + n + " are: " + (i-1) + ", " + i);
          return 1;
        }
      }
      return 0;
    }
}
