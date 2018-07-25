public class henry2{
	public static void main(String[] args){
		int result = henry(1, 3);
		System.out.println(result);
	}

	static int henry(int i, int j) {
		int henry = 0;
		int perfectCount = 0;
		int num = 1;
		int[] perfectNum = new int[j];

		while (perfectCount < j) {
			int sum = 0;
			for (int divisor = 1; divisor <= num/2; divisor++) {
				if (num % divisor == 0) {
					sum += divisor;
				}
			}
			if (sum == num) {
				perfectNum[perfectCount] = num;
				perfectCount++;
			}
			num ++;
		}
		henry = perfectNum[i-1] + perfectNum[j-1];
		return henry;
	}
}
