public class BunkerArray_another {

    public static void main(String[] args) {
        System.out.println(isBunker(new int[]{7, 6, 10, 1}));
        System.out.println(isBunker(new int[]{7, 6, 10}));
        System.out.println(isBunker(new int[]{6, 10, 1}));
        System.out.println(isBunker(new int[]{3, 7, 1, 8, 1}));
    }

    static int isBunker(int[] a) {
      boolean flagOne = false, flagPrime = false;

      for(int element : a) {
        if(element == 1)
          flagOne = true;
        else if(isPrime(element) == 1)
          flagPrime = true;
        if(flagOne && flagPrime)
          return 1;
      }
      if(!flagOne && !flagPrime)
        return 1;
      return 0;
    }

    static int isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return 0;
        }
        return n > 1 ? 1 : 0;
    }
  }
