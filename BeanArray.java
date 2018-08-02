public class BeanArray {

    public static void main(String[] args) {
/*
      System.out.println(isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
      System.out.println(isBeanArray(new int[]{13, 4, 4, 4, 4}));
      System.out.println(isBeanArray(new int[]{10, 5, 5}));
      System.out.println(isBeanArray(new int[]{0, 6, 8, 20}));
      System.out.println(isBeanArray(new int[]{3}));
      System.out.println(isBeanArray(new int[]{8, 5, -5, 5, 3}));
*/
      System.out.println();
      System.out.println(isBean1(new int[]{1, 2, 3, 9, 6, 13}));
      System.out.println(isBean1(new int[]{3, 4, 6, 7, 13, 15}));
      System.out.println(isBean1(new int[]{1, 2, 3, 4, 10, 11, 12}));
      System.out.println(isBean1(new int[]{3, 6, 9, 5, 7, 13, 6, 17}));
      System.out.println(isBean1(new int[]{9, 6, 18}));
      System.out.println(isBean1(new int[]{4, 7, 16}));
    }

    static int isBean1(int[] a) {
      boolean flag7 = false, flag9 = false, flag13 = false, flag16 = false;
      for(int i = 0; i < a.length; i++) {
        if(a[i] == 9)
          flag9 = true;
        else if(a[i] == 13)
          flag13 = true;
        else if(a[i] == 7)
          flag7 = true;
        else if(a[i] == 16)
          flag16 = true;
      }
      if((flag9 && !flag13) || (flag7 && flag16))
        return 0;
      return 1;
    }
}
