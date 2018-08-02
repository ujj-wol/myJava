public class Balanced {

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[]{-5, 2, -2}));

        System.out.println();
        System.out.println(isBalanced(new int[]{2, 3, 6, 7}));
        System.out.println(isBalanced(new int[]{6, 7, -2, 3, -12}));
        System.out.println(isBalanced(new int[]{7, 15, 2, 3}));
        System.out.println(isBalanced(new int[]{-6, 6, 6}));

    }

    public static int isBalanced(int[] a) {
      boolean flagBalanced = false;
      for(int i = 0; i < a.length; i++) {
        flagBalanced = false;
        for(int j = 0; j < a.length; j++) {
          if(a[i] + a[j] == 0) {
            flagBalanced = true;
            break;
          }
        }
        if(!flagBalanced)
          return 0;
      }
      return 1;
    }
}
