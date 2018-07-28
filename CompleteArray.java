public class CompleteArray {

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{36, -28}));
        System.out.println(isComplete(new int[]{36, 28}));
        System.out.println(isComplete(new int[]{4}));
        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
    }

    static int isComplete(int[] a) {

      boolean even = false, perfectSquare = false, sumTo8 = false;
      for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0)
          even = true;
        if (isSquare(a[i]) == 1)
          perfectSquare = true;

        for (int j = i + 1; j < a.length && sumTo8 == false; j++) {
          if (a[i] + a[j] == 8 && a[i] != a[j])
            sumTo8 = true;
        }
        if (even && perfectSquare && sumTo8)
          return 1;
      }
      return 0;
    }

    static int isSquare(int n) {
  		if (n < 0) return 0;
  		int sq = 0;
        for (int i = 0; sq <= n; i++) {
          sq = i * i;
          if (sq == n) {
            return 1;
          }
        }
      return 0;
  	}
  }
