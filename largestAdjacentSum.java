public class largestAdjacentSum {

  public static void main(String[] args) {
    int result = largestAdjacentSum(new int[] {1, 2, 3, 4});
    System.out.println(result);
    result = largestAdjacentSum(new int[] {18, -12, 9, -10});
    System.out.println(result);
    result = largestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1});
    System.out.println(result);
    result = largestAdjacentSum(new int[] {1,1,1,1,1,2,1,1,1});
    System.out.println(result);

  }

  static int largestAdjacentSum(int[] a) {
    int sum = 0;
    int sumNew = 0;

    for (int i = 0; i < a.length -1; i++) {
      sumNew = a[i] + a[i+1];
      if (sumNew > sum) {
        sum = sumNew;
      }
    }
    return sum;
  }
}
