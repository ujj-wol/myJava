public class findPorcupineNumber2{
	public static void main(String[] args){
		int result = findPorcupineNumber(137);
		System.out.println(result);
		result = findPorcupineNumber(138);
		System.out.println(result);
		result = findPorcupineNumber(139);
		System.out.println(result);
	}

	static int findPorcupineNumber(int n) {
		boolean isPorcupine = false;
		do {
			n++;
      if (n % 10 == 9 && isPrime(n) == 1) {
        boolean condition = false;
        int p = n + 1;
        while (!condition) {
          if (isPrime(p) == 1) {
            condition = true;
            if (p % 10 == 9) {
              return n;
            }
          }
          p++;
        }
      }
		} while (!isPorcupine);
		return 0;
	}

	static int isPrime(int n) {
		int isPrime = 0;
		if (n > 1) {
			isPrime = 1;
			for (int divisor = 2; divisor <= n/2; divisor++) {
				if (n % divisor == 0) {
					isPrime = 0;
					break;
				}
			}
		}
		return isPrime;
	}
}
