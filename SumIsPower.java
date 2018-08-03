public class SumIsPower {
  public static void main(String[] args) {
    System.out.println(sumIsPower(new int[] {8,8,8,8}));
    System.out.println(sumIsPower(new int[] {8,8,8}));
  }

  static int sumIsPower(int[] a) {
    int sum = 0;
    for(int element : a) {
      sum += element;
    }
    int power = 2;
    while(power < sum) {
      power *= 2;
    }
    if(power == sum) return 1;
    return 0;
  }
}
