public class isIsolated {

	public static void main(String[] args) {

		System.out.println(isIsolated(-5));
		System.out.println(isIsolated(3));
    System.out.println(isIsolated(2097152));
    System.out.println(isIsolated(2));
    System.out.println(isIsolated(63));
    System.out.println(isIsolated(50));

  }

  static int isIsolated (long n) {
    if (n < 1 || n > 2097151) return -1;

    long square =  n * n;
    long cube = n * n * n;

    int length = 0;
    while (square > 0) {
      length++;
      square /= 10;
    }

    long[] sqArray = new long[length];
    square = n*n;
    int i = 0;
    while (square > 0) {
      sqArray[i] = square % 10;
      square /= 10;
      i++;
    }

    long num = 0;
    while (cube > 0) {
      num = cube % 10;

      for (int j = 0; j < sqArray.length; j++) {
        if (num == sqArray[j]) return 0;
      }
      cube /= 10;
    }
    return 1;
  }
}
