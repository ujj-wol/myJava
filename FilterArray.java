public class FilterArray {

    public static void main(String[] args) {
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println(isFilter(new int[]{9, 6, 18}));
        System.out.println(isFilter(new int[]{4, 7, 13}));
    }

    static int isFilter(int[] a) {
      boolean contains7 = false, contains9 = false, contains11 = false, contains13 = false;

      for (int i = 0; i < a.length; i++) {
        if(a[i] == 9)
          contains9 = true;
        else if(a[i] == 7)
          contains7 = true;
        else if(a[i] == 11)
          contains11 = true;
        else if(a[i] == 13)
          contains13 = true;
      }
      if(contains9 && !contains11)
        return 0;
      if(contains7 && contains13)
        return 0;
      return 1;
    }
}
