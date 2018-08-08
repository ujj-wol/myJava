public class FiftyPrime {
  public static void main(String[] args) {
    int count = 0, checkPrime = 2;
    final int NUMBER_OF_PRIMES = 50;
    final int NUMBER_OF_PRIMES_PER_LINE = 10;
    while(count < NUMBER_OF_PRIMES) {
      boolean isPrime = true;
      for(int i = 2; i <= checkPrime/2; i++) {
        if(checkPrime % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        if(count % NUMBER_OF_PRIMES_PER_LINE == 0)
          System.out.println("");
        System.out.printf("%4d", checkPrime);
        count++;
      }
      checkPrime++;
    }
  }
}
