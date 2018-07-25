public class doIntegerBasedRounding {

  public static void main(String[] args) {
		int[] result = doIntegerBasedRounding(new int[]{1,2,3,4,5}, 2);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    System.out.println(" ");

    result = doIntegerBasedRounding(new int[]{1,2,3,4,5}, 3);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    System.out.println(" ");

    result = doIntegerBasedRounding(new int[]{1,2,3,4,5}, -3);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    System.out.println(" ");

    result = doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    System.out.println(" ");

    result = doIntegerBasedRounding(new int[]{-18, 1,2,3,4,5}, 4);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    System.out.println(" ");

    result = doIntegerBasedRounding(new int[]{1,2,3,4,5}, 5);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    System.out.println(" ");

    result = doIntegerBasedRounding(new int[]{1,2,3,4,5}, 100);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

  static int[] doIntegerBasedRounding(int[] a, int n)
  {
      int[] newA = new int[a.length];
      if (n > 0)
      {
          int rem = 0;
          int add = 0;
          for (int i=0; i < a.length; i++)
          {
              if (a[i] > 0) {
                  rem = a[i] % n;
                  if (rem >= n/2.0){
                    add = n;
                  } else {
                    add = 0;
                  }
                  newA[i] = a[i] - rem + add;
              } else {
                newA[i] = a[i];
              }
          }
      } else newA = a;
      return newA;
  }
}
