public class NormalNumber {

    public static void main(String[] args) {
        System.out.println(isNormal(1));
        System.out.println(isNormal(2));
        System.out.println(isNormal(3));
        System.out.println(isNormal(4));
        System.out.println(isNormal(5));
        System.out.println(isNormal(6));
        System.out.println(isNormal(7));
        System.out.println(isNormal(8));
        System.out.println(isNormal(9));
    }

    static int isNormal(int n) {
      for (int i = 3; i < n; i += 2) {
        if(n % i == 0)
          return 0;
      }
      return 1;
    }

    static int isNormal1(int n) {
      for (int i = 2; i < n; i++) {
        int factor = 0;
        if (n % i == 0)
          factor = i;

        if (factor % 2 != 0)
          return 0;
      }
      return 1;
    }
}
