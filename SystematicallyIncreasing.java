public class SystematicallyIncreasing {
  public static void main (String[] args) {
    System.out.println(isSystematicallyIncreasing(new int[] {}));
    System.out.println(isSystematicallyIncreasing(new int[] {1}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 2}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 2, 1, 2, 3}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 3}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 2, 1, 2, 1, 2}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 2, 3, 1, 2, 1}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 3}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
    System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 5, 1, 2, 3, 4, 5, 6}));

  }

  static int isSystematicallyIncreasing (int[] a) {
    if (a == null || a.length == 0) return 0;
    // if first element is not 1 or length is 2 (Eg. {1, 1})
    if (a[0] != 1 || a.length == 2) return 0;

    int startIndex = 1;
    int j;
    // start an outer loop so that inner loop can test for values
    for (int i = 2; i < a.length; i++) {
      // to remove array with incomplete digits (Coz length needs to be 1, 3, 6, 10, 15 and so on)
      if (a.length < i + startIndex) {
        return 0;
      }
      // test for values using inner loop
      int num = 1;
      for (j = startIndex; j < i + startIndex; j++) {
        if (a[j] != num) {
          return 0;
        }
        num ++;
      }
      // if all digits in the array are tested and none are failing above conditions,
      // the array must now be a SystematicallyIncreasing array
      if (a.length == i + startIndex) {
        break;
      }
      startIndex = j;
    }
    return 1;
  }
}
