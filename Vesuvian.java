public class Vesuvian {
  public static void main (String[] args) {
    System.out.println(isVesuvian(50));
    System.out.println(isVesuvian(65));
    System.out.println(isVesuvian(85));
    System.out.println(isVesuvian(2));
    System.out.println(isVesuvian(55));
    System.out.println(isVesuvian(1));
    System.out.println(isVesuvian(22));
  }

  public static int isVesuvian (int n) {
    int i = 0, count = 0;
    for (; i <= (int)Math.sqrt(n); i++) {
    //for (; i * i <= n; i++) {
      int j = i, sum = 0;
      while (sum < n) {
        sum = i * i + j * j;
        if (sum == n) {
          count++;
          break;
        }
        j++;
      }
    }
    if (count == 2) return 1;
    else return 0;
  }
}
