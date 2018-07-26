public class LargestDifferenceOfEvens {
  public static void main (String[] args) {
    System.out.println(largestDifferenceOfEvens(new int[] {1, 3, 5, 9}));
    System.out.println(largestDifferenceOfEvens(new int[] {1, 18, 5, 7, 33}));
    System.out.println(largestDifferenceOfEvens(new int[] {2,2,2,2}));
    System.out.println(largestDifferenceOfEvens(new int[] {1, 2, 1, 2, 1, 4, 1, 6, 4}));
  }

  static int largestDifferenceOfEvens (int[] a) {

    int maxEven = 0, minEven = 0;
    int count = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        if (count == 0)
          maxEven = minEven = a[i];
        count++;
        maxEven = (a[i] > maxEven)? a[i]:maxEven;
        minEven = (a[i] < minEven)? a[i]:minEven;
      }
    }
    if (count >= 2)
      return maxEven - minEven;
    else
      return -1;
  }
}
