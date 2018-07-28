import java.util.Arrays;

public class HasNValues {

    public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
    }

    static int hasNValues(int[] a, int n) {

        if (a.length < n)
            return 0;
        int[] sortedArray = new int[a.length];

        for (int l = 0; l < a.length; l++) {
          sortedArray[l] = a[l];
        }

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
          for (int j = i + 1; j < a.length; j++) {
            if (sortedArray[j] < sortedArray[i]) {
              temp = sortedArray[i];
              sortedArray[i] = sortedArray[j];
              sortedArray[j] = temp;
            }
          }
        }

        //System.out.println(Arrays.toString(sortedArray));

        int distinctCount = 1;
        for (int k = 0; k < sortedArray.length - 1; k++) {
          if (sortedArray[k] != sortedArray[k+1])
            distinctCount++;
          if (distinctCount > n)
            break;
        }

        if (distinctCount == n)
          return 1;
        else
          return 0;
    }

/*
    static int hasNValues(int[] a, int n) {

        if (a.length < n)
            return 0;

        int[] uniqueArray = new int[n];
        int totalAdded = 0;
        boolean uniqueFlag;

        for (int anA : a) {
            uniqueFlag = false;
            for (int anUnique : uniqueArray) {
                if (anA == anUnique) {
                    uniqueFlag = true;
                    break;
                }
            }
            if (!uniqueFlag) {
                if (totalAdded >= n) return 0;
                uniqueArray[totalAdded] = anA;
                totalAdded++;
            }
        }

        if (totalAdded == n) return 1;
        return 0;
    }
*/

}
