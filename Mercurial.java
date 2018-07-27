public class Mercurial {
  public static void main (String[] args) {
    System.out.println(isMercurial(new int[] {1, 2, 10, 3, 15, 1, 2, 2}));
    System.out.println(isMercurial(new int[] {5, 2, 10, 3, 15, 1, 2, 2}));
    System.out.println(isMercurial(new int[] {1, 2, 10, 3, 15, 16, 2, 2}));
    System.out.println(isMercurial(new int[] {3, 2, 18, 1, 0, 3, -11, 1, 3}));
    System.out.println(isMercurial(new int[] {2, 3, 1, 1, 18}));
    System.out.println(isMercurial(new int[] {8, 2, 1, 1, 18, 3, 5}));
    System.out.println(isMercurial(new int[] {3, 3, 3, 3, 3, 3}));
    System.out.println(isMercurial(new int[] {1}));
    System.out.println(isMercurial(new int[] {}));

  }

  static int isMercurial (int[] a) {
    boolean checkForThree = false, foundThree = false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        checkForThree = true;
        if (foundThree) return 0;
      }
      if (checkForThree) {
        if (a[i] == 3) foundThree = true;
      }
    }
    return 1;
  }
}
