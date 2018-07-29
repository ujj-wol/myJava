public class LayeredArray {
  public static void main(String[] args) {
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(isLayered(new int[]{2}));
        System.out.println(isLayered(new int[]{}));
  }

  static int isLayered (int[] a) {
    if (a.length <= 1)
      return 0;

    boolean checkForRepeat = true;
    for (int i = 1; i < a.length; i++) {
      if (checkForRepeat) {
        if (a[i] != a[i-1])
          return 0;
        else {
          checkForRepeat = false;
          continue;
        }
      }
      if (a[i] < a[i-1])
        return 0;
      else if (a[i] > a[i-1])
        checkForRepeat = true;
    }
    return 1;
  }
}

/*
    static int isLayered(int[] a) {
        if (a.length <= 1)
            return 0;

        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return 0;

            if (a[i] == a[i + 1])
                count++;

            if (a[i] != a[i + 1]) {
                if (count < 2)
                    return 0;
                count = 1;
            }
        }
        return 1;
    }
*/
