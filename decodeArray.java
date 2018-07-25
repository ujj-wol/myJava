public class decodeArray {
  public static void main (String[] args) {
    System.out.println(decodeArray(new int[] {0, -3, 0, -4, 0}));

    System.out.println(decodeArray(new int[] {-1, 5, 8, 17, 15}));

    System.out.println(decodeArray(new int[] {1, 5, 8, 17, 15}));

    System.out.println(decodeArray(new int[] {111, 115, 118, 127, 125}));

    System.out.println(decodeArray(new int[] {1, 1}));
  }

  static int decodeArray (int[] a) {
    int digit = 0, num = 0;
    for (int i = 0; i < a.length - 1; i++) {
      digit = a[i] - a[i + 1];
      if (digit < 0)
        digit *= -1;
      num = num * 10 + digit;
    }
    return (a[0] >= 0)? num: (-num);
  }
}
