import java.util.Arrays;

public class MielageCounter {

    public static void main(String[] args) {
        int[] a = new int[]{8, 9, 9, 5, 0};
        updateMileageCounter(a, 1);

        System.out.println(Arrays.toString(a));

        int[] b = new int[]{8, 9, 9, 5, 0};
        updateMileageCounter(b, 2);

        System.out.println(Arrays.toString(b));

        int[] c = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(c, 1);

        System.out.println(Arrays.toString(c));

        int[] d = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(d, 13);

        System.out.println(Arrays.toString(d));

        d = new int[]{9, 9, 9, 9};
       updateMileageCounter(d, 13);

       System.out.println(Arrays.toString(d));
    }

    static void updateMileageCounter(int[] a, int miles) {
        for (int i = 0; i < a.length && miles > 0; i++) {
            miles = a[i] + miles;
            if (miles < 10) {
                a[i] = miles;
                break;
            } else {
                a[i] = miles % 10;
                miles /= 10;
            }
        }
    }

    static void updateMileageCounter1(int[] a, int miles) {
      while (miles > 0) {
        int i = 0;
        do {
          a[i] = (a[i] + 1) % 10;
          i++;
        } while (a[i-1] == 0 && i < a.length);
        miles--;
      }
    }

    static void updateMileageCounter2(int[] a, int miles) {
      long totalMiles = 0;
      for (int i = a.length - 1; i >= 0; i--) {
        totalMiles = totalMiles * 10 + a[i];
      }
      totalMiles += miles;
      for (int j = 0; j < a.length; j++) {
        a[j] = (int)(totalMiles % 10);
        totalMiles /= 10;
      }
    }

}
