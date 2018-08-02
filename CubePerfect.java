public class CubePerfect {

    public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }

    static int isCubePerfect(int[] a) {
      if(a.length == 0)
        return 1;

      for (int i = 0; i < a.length; i++) {
        if (a[i] == 0 || a[i] == 1 || a[i] == -1)
          continue;

        boolean isCube = false;
        for (int j = 2; j < Math.abs(a[i]) / 2; j++) {
          if (a[i] > 1) {
            if (a[i] == Math.pow(j, 3)) {
              isCube = true;
              break;
            }
          }
          if (a[i] < -1) {
            if (a[i] == Math.pow(-j, 3)) {
              isCube = true;
              break;
            }
          }
        }
        if(!isCube)
          return 0;
      }
      return 1;
    }

    static int isCubePerfect1(int[] a) {
        if (a.length == 0)
            return 1;

        for (int anA : a) {

            anA = anA > 0 ? anA : -anA;
            int number = 1;
            int cube = 0;
            while (cube < anA) {
                cube = number * number * number;
                number++;
            }
            if (cube != anA)
                return 0;
        }
        return 1;
    }
}
