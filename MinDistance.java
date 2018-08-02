public class MinDistance {

    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }

    static int minDistance(int n) {
      int previousFactor = 1;
      int minDistance = Integer.MAX_VALUE;

      for(int i = 2; i <= n; i++) {
        if(n % i == 0) {
          if(i - previousFactor < minDistance)
            minDistance = i - previousFactor;

          previousFactor = i;
        }
      }
      return minDistance;
    }

    static int minDistance1(int n) {
        int a = 0, b = 0, min = 0;
        for(int i = 1; i <= n; i++) {
          if(n % i == 0) {
            if(a == 0 && b == 0)
              a = i;
            else if(a != 0 && b == 0) {
              b = i;
              min = b - a;
            }
            else {
              if(i - b < min) {
                min = i - b;
              }
              b = i;
            }
          }
        }
        return min;
    }
  }
