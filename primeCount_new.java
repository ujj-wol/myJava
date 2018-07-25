public class primeCount_new{
	public static void main(String[] args){
		int result = primeCount(10, 30);
		System.out.println(result);
		result = primeCount(11, 29);
		System.out.println(result);
		result = primeCount(20, 22);
		System.out.println(result);
		result = primeCount(1, 1);
		System.out.println(result);
		result = primeCount(5, 5);
		System.out.println(result);
		result = primeCount(6, 2);
		System.out.println(result);
		result = primeCount(-10, 6);
		System.out.println(result);
	}

	static int primeCount(int start, int end) {
		int primeCount = 0;
		int add = 0; // this can be replaced with a boolean variable
		for (int number = start; number <= end; number++) {
			if (number > 1) {
				add = 1; // to count for values 2 and 3
				for (int divider = 2; divider <= (number/2); divider++) {
					if (number % divider == 0) {
						add = 0;
						break;
					}
				}
				primeCount += add;
			}
		}
		return primeCount;
	}
}
