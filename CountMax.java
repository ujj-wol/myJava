public class CountMax {

  public static void main(String[] args) {
    System.out.println(countMax(new int[] {6, 3, 1, 3, 4, 3, 6, 5}));
    System.out.println(countMax(new int[] {6, 3, 1, 3, 4, 3, 5}));
    System.out.println(countMax(new int[] {6, 3, 1, 3, 4, 3, 6, 9}));
    System.out.println(countMax(new int[] {3, 1, 3, 2, 3, 1}));

  }

  static int countMax(int[] a) {
    int max = a[0];
    //int max = Integer.MIN_VALUE;
    int count = 1;
    for(int i = 1; i < a.length; i++) {
      if(a[i] == max)
        count++;
      else if(a[i] > max) {
        max = a[i];
        count = 1;
      }
    }
    return count;
  }
}
