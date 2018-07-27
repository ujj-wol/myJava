public class OneBalanced_usingSwitch {
  public static void main (String[] args) {
    System.out.println(isOneBalanced (new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
    System.out.println(isOneBalanced (new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
    System.out.println(isOneBalanced (new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
    System.out.println(isOneBalanced (new int[] {}));
    System.out.println(isOneBalanced (new int[] {3, 4, 1, 1}));
    System.out.println(isOneBalanced (new int[] {1, 1, 3, 4}));
    System.out.println(isOneBalanced (new int[] {3, 3, 3, 3, 3, 3}));
    System.out.println(isOneBalanced (new int[] {1, 1, 1, 1, 1, 1}));

  }

  static int isOneBalanced (int[] a) {
    if (a.length == 0) return 1;
    int signChanges = 0, countOnes = 0, countNotOnes = 0;
    int category = 2;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) countOnes++;
      else countNotOnes++;

      switch (category) {
        case 1:
          if (a[i] == 1) {
            signChanges++;
            category = 2;
          }
          break;
        case 2:
          if (a[i] != 1) {
            signChanges++;
            category = 1;
          }
      }
    }
    if ((signChanges == 1 || signChanges == 2) && countOnes == countNotOnes) return 1;
    else return 0;
  }
}
