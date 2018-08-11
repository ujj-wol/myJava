public class DistinctIntegersCount {
  public static void main (String[] args) {
    System.out.println(countDistinct(new int[] {1, 2, 3, 10}));
    System.out.println(countDistinct(new int[] {5, 5, 5, 5}));
    System.out.println(countDistinct(new int[] {5, 1, 5, 5}));
    System.out.println(countDistinct(new int[] {5, 1, 5}));
    System.out.println(countDistinct(new int[] {5, 2, 2, 1, 3, 7, 11, 5}));
    System.out.println(countDistinct(new int[] {99, 5, 25, 25, 75, 55}));
  }

  static int countDistinct (int[] a) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          count++;
          break;
        }
      }
    }
    return a.length - count;
  }
}
