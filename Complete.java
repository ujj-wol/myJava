public class Complete {

    public static void main(String[] args) {

        System.out.println(isComplete_another(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete_another(new int[]{2, 3, 3, 6}));
        System.out.println(isComplete_another(new int[]{2, -3, 4, 3, 6}));
        System.out.println(isComplete_another(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 12}));
      /*
        System.out.println();
        System.out.println(isComplete1(new int[]{36, -28}));
        System.out.println(isComplete1(new int[]{36, 28}));
        System.out.println(isComplete1(new int[]{4}));
        System.out.println(isComplete1(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete1(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
      */
        System.out.println();
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete(new int[]{2, 2}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
    }

    static int isComplete(int[] a) {
      boolean evens = false, innerValuePresent = false;
      int minEven = 0, maxEven = 0;
      for(int i = 0; i < a.length; i++) {
        if(a[i] % 2 == 0) {
          if(!evens) {
            minEven = a[i];
            maxEven = a[i];
          }
          else {
          if(a[i] < minEven)
            minEven = a[i];
          else if(a[i] > maxEven)
            maxEven = a[i];
          }
          evens = true;
        }
      }
      if(!evens || minEven == maxEven)
        return 0;

      for(int j = (minEven + 1); j < maxEven; j++) {
        innerValuePresent = false;
        for(int k = 0; k < a.length; k++) {
          if(a[k] == j) {
            innerValuePresent = true;
            break;
          }
        }
        if(!innerValuePresent)
          return 0;
      }
      return 1;
    }

    static int isComplete_another(int[] a) {
      int maxEven = Integer.MIN_VALUE;
      for(int element : a) {
        if(element <= 0)
          return 0;

        if(element % 2 == 0 && element > maxEven)
          maxEven = element;
      }

      for(int i = 2; i < maxEven; i = i + 2) {
        boolean flag = false;
        for(int element : a) {
          if(element == i) {
            flag = true;
            break;
          }
        }
        if(!flag) return 0;
      }
      return 1;
    }


  }
