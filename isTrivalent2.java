public class isTrivalent2 {

	public static void main(String[] args) {

		System.out.println(isTrivalent(new int[] {22, 19, 10, 10, 19, 22, 22, 10}));
		System.out.println(isTrivalent(new int[] {1, 2, 2, 2, 2, 2, 2} ));
		System.out.println(isTrivalent(new int[] {2, 2, 3, 3, 3, 3, 2, 41, 65} ));
		System.out.println(isTrivalent(new int[] {-1, 0, 1, 0, 0, 0} ));
		System.out.println(isTrivalent(new int[] {} ));
		System.out.println(isTrivalent(new int[] { 2147483647, -1, -1, -2147483648}));

  }

// *Note: -12 % 10 = -2 and -12 / 10 = -1
	static  int isTrivalent (int[ ] a) {
      int tmp; int count = 1;
      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a.length - 1; j++) {
              if (a[j] > a[j + 1]) {
                  tmp = a[j];
                  a[j] = a[j + 1];
                  a[j + 1] = tmp;
              }
          }
      }

      for (int i = 0; i < a.length - 1 ; i++) {
          if (a[i + 1] != a[i]) {
              count++;
          }
      }
      if (count == 3) return 1;
      return 0;
  }
}
