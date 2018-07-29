public class AllPossibilitiesArray {

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println(isAllPossibilities(new int[]{0}));
        System.out.println(isAllPossibilities(new int[]{}));
    }

    static int isAllPossibilities(int[] a) {
        if (a.length == 0)
            return 0;

        boolean foundElement = false;

        for (int i = 0; i < a.length; i++) {
          foundElement = false;
          for (int j = 0; j < a.length; j++) {
            if (i == a[j]) {
              foundElement = true;
              break;
            }
          }
          if (!foundElement)
            return 0;
        }
        return 1;
    }
}
