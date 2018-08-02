public class MeeraArray {

  public static void main(String[] args) {
    System.out.println(isMeera(new int[]{3, 5, -2}));
    System.out.println(isMeera(new int[]{8, 3, 4}));
  }

  static int isMeera(int[] a) {
        for (int a1 : a) {
            for (int a2 : a) {
                if (a1 == a2 * 2)
                    return 0;
            }
        }
        return 1;
    }
}
