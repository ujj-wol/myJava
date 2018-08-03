public class EvenSubset {
  public static void main(String[] args) {
    System.out.println(isEvenSubset(18, 12));
    System.out.println(isEvenSubset(18, 32));
  }

  static int isEvenSubset(int m, int n) {
    for(int i = 2; i <= m / 2; i = i + 2) {
      if(m % i == 0 && n % i != 0)
        return 0;
    }
    return 1;
  }
}
