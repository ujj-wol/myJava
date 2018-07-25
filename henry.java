public class henry{
	public static void main(String[] args){
		int result = henry(1, 3);
		System.out.println(result);
	}

	static int henry(int i, int j) {
		int henry = 0;
		int perfectCount = 0;
		int c = 0;
		int max = Integer.MAX_VALUE;

		for (int num = 1; num <= max; num++) {
			int sum = 0;
			for (int divisor = 1; divisor < num; divisor++) {
				if (num % divisor == 0) {
					sum += divisor;
				}
			}
			if (sum == num) {
				perfectCount++;

				if (perfectCount == i || perfectCount == j) {
					henry += num;
					c++;
				}
				if (c == 2) break;
			}
		}
		return henry;
	}
}
