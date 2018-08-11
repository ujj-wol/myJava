public class ContinuousFactored {

    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(99));
        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));
        System.out.println(isContinuousFactored(240));
        System.out.println(isContinuousFactored(180));
    }

    static int isContinuousFactored1(int n) {
      for(int i = 2; i <= n/2; i++) {
        int j = i;
        int product = 1;
        while(n % j == 0 && product < n) {
          //System.out.println(j);
          product *= j;
          if(product == n)
            return 1;
          j++;
        }
      }
      return 0;
    }

    static int isContinuousFactored(int n) {
        for (int i = 2; i <= n/2; i++) {
          int j = i;
          int product = 1;
          while(n % j == 0 && product < n) {
            product *= j;
            j++;
          }
          if(product == n) return 1;
        }
        return 0;
    }
}
