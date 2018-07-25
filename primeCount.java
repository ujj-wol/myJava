public class primeCount{
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
		if (start <= 1 && end <= 1) return 0;
		int count = 0;
		if (start <= 1) {
			start = 2;
			count++;
		}
		for (int i = start; i <= end; i++) {
			for (int j = 2; j <= (i/2 + 1); j++) {
				if (i % j == 0) break;
				if (j == i/2 + 1) count++;
			}
		}
		return count;
	}
}
