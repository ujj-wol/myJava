public class decodeArray_anotherQuestion {
  public static void main (String[] args) {
    System.out.println(decodeArray(new int[] {1}));

    System.out.println(decodeArray(new int[] {0, 1}));

    System.out.println(decodeArray(new int[] {-1, 0, 1}));

    System.out.println(decodeArray(new int[] {0, 1, 1, 1, 1, 1, 0, 1}));

    System.out.println(decodeArray(new int[] {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));

    System.out.println(decodeArray(new int[] {-1, 0 ,1, 1}));
  }

  public static int decodeArray (int[] a) {
    int start = 0;
    if (a[0] == -1)
      start = 1;
    int number = 0, digit = 0;
    for (int i = start; i < a.length; i++) {
      digit = 0;
      while (a[i] == 0) {
        digit ++;
        i++;
      }
      number = number * 10 + digit;
    }
    if (a[0] == -1)
      return number * -1;
    return number;
  }
}
