public class countSquarePairs{
	public static void main(String[] args) {
		int result = countSquarePairs(new int[] {9, 0, 2, -5, 7});
		System.out.println(result);
		result = countSquarePairs(new int[] {9});
		System.out.println(result);
		result = countSquarePairs(new int[]{11, 5, 4, 20});
		System.out.println(result);
	}

	static int countSquarePairs(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j] && a[i] > 0) {
					count += isPerfectSquare(a[i] + a[j]);
				}
			}
		}
		return count;
	}

	static int isPerfectSquare(int n) {
		int t = (int)Math.sqrt(n);
		if (t*t == n) return 1;
		return 0;
	}
}
