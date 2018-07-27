public class OneBalanced {
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
    boolean checkForNot1 = true, checkFor1 = false;
    int signChanges = 0, countOnes = 0, countNotOnes = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) countOnes++;
      else countNotOnes++;

      if (checkForNot1) {
        if (a[i] != 1) {
          signChanges++;
          checkFor1 = true;
          checkForNot1 = false;
          continue;
        }
      } else {
          if (a[i] == 1) {
            signChanges++;
            checkFor1 = false;
            checkForNot1 = true;
            continue;
          }
      }
    }
    if ((signChanges == 1 || signChanges == 2) && countOnes == countNotOnes) return 1;
    else return 0;
  }
}
