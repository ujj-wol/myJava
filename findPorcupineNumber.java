public class findPorcupineNumber{
	public static void main(String[] args){
		int result = findPorcupineNumber(137);
		System.out.println(result);
		result = findPorcupineNumber(138);
		System.out.println(result);
		result = findPorcupineNumber(139);
		System.out.println(result);
	}

	static int findPorcupineNumber(int n) {
		int porcupineNumber = 0;
		boolean isPorcupine = false;
		n++;
		int maxInt = Integer.MAX_VALUE;
		do {
			if (isPorcupine) {        // this part runs only after a prime number ending at 9 is found
				if (isPrime(n) == 1) {
					if (n % 10 == 9) {
						return porcupineNumber;
					} else {
						isPorcupine = false;
					}
				}
			} else {     			 // this part runs to find a prime number ending at 9

				if (n % 10 == 9) {
					if (isPrime(n) == 1) {
						porcupineNumber = n;
						isPorcupine = true;
					}
				}
			}
			n++;
		} while (n <= maxInt);
		return porcupineNumber;
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
