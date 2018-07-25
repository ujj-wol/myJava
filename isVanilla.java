public class isVanilla {

	public static void main(String[] args) {

		System.out.println(isVanilla(new int[] {1, 1, 11, 1111, 1111111} ));
		System.out.println(isVanilla(new int[] {1} ));
    System.out.println(isVanilla(new int[] {11, 22, 13, 34, 125} ));
    System.out.println(isVanilla(new int[] {9,999,99999,-9999} ));
    System.out.println(isVanilla(new int[] {} ));

  }

// *Note: -12 % 10 = -2 and -12 / 10 = -1 

  static int isVanilla(int[] a) {
    if (a.length == 0) return 1;
    int testDigit = a[0];
    int p = 0;
    while (testDigit > 0) {
      p = testDigit;
      testDigit /= 10;
    }
    if (p < 0)
      testDigit = -p;
    else
      testDigit = p;

    int q = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0) a[i] = -a[i];
      while (a[i] > 0) {
        q = a[i] % 10;
        if (q != testDigit) return 0;
        a[i] /= 10;
      }
    }
    return 1;
  }

}
