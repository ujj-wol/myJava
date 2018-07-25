// The function findPorcupineNumber has error, refer to findPorcupineNumber.java file,
// that has all correct functions.

public class findPorcupineNum{
	public static void main(String[] args){
		int result = findPorcupineNumber(137);
		System.out.println(result);
		/*
		result = findPorcupineNumber(138);
		System.out.println(result);
		result = findPorcupineNumber(139);
		System.out.println(result);
		*/
	}

	static int findPorcupineNumber(int n) {
		int porcupineNum = 0;
		do {
			n++;
			if (n % 10 == 9) {
				if (isPrime(n) == 1) {
					int nextNum = n+1;
					do {
						if (isPrime(nextNum) == 1) {
							if(nextNum % 10 == 9) {
								porcupineNum = n;
								//break;
								return porcupineNum;
							}
						}
						nextNum++;
					} while (porcupineNum == 0);
				}
			}
		} while (porcupineNum == 0);
		return porcupineNum;
	}

	static int isPrime(int number){
		int isPrime = 0;
		if(number > 1){
			isPrime = 1;
			for(int divider = 2; 2*divider <= number; divider++){
				if(number % divider == 0){
					isPrime = 0;
					break;
				}
			}
		}
		return isPrime;
	}
}
