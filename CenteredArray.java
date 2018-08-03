public class CenteredArray {

  public static void main(String[] args) {
    System.out.println(isCentered(new int[]{1, 2, 3, 4, 5}));
    System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
    System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
    System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
    System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
    System.out.println(isCentered(new int[]{}));
    System.out.println(isCentered(new int[]{1}));
  }

  static int isCentered1(int[] a) {
    if(a.length % 2 == 0 || a.length == 0)
      return 0;

    for(int i = 0, j = a.length-1; i < j; i++, j--) {
      if(a[i] <= a[a.length / 2] || a[j] <= a[a.length / 2])
        return 0;
    }
    return 1;
  }

  static int isCentered(int[] a) {
    if (a.length == 0 || a.length % 2 == 0)
      return 0;

    int centerIndex = (a.length - 1) / 2;
    int centerValue = a[centerIndex];

    for (int i = 0; i < a.length; i++) {
      if (i != centerIndex && a[i] <= centerValue)
        return 0;
    }
    return 1;
  }
}
