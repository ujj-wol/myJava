public class nUpCount{
	public static void main(String[] args) {
		int result = nUpCount(new int[] {2,3,1,-6,8,-3,-1,2}, 5);
		System.out.println(result);
	}

	static int nUpCount(int[] a, int n) {
		int sum = 0, prevSum, count = 0;

		for (int i = 0; i < a.length; i++) {
			prevSum = sum;
			sum += a[i];
			if (prevSum <= n && sum > n) count++;
		}
		return count;
	}
}
