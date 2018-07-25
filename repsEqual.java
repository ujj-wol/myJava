public class repsEqual{
	public static void main(String[] args){
		int result = repsEqual(new int[] {3, 2, 0, 5, 3}, 32053);
		System.out.println(result);
		result = repsEqual(new int[] {3, 2, 0, 5}, 32053);
		System.out.println(result);
		result = repsEqual(new int[] {3, 2, 0, 5, 3, 4}, 32053);
		System.out.println(result);
		result = repsEqual(new int[] {2, 3, 0, 5, 3}, 32053);
		System.out.println(result);
		result = repsEqual(new int[] {9, 3, 1, 1, 2}, 32053);
		System.out.println(result);
		result = repsEqual(new int[] {0, 3, 2, 0, 5, 3}, 32053);
		System.out.println(result);
	}


	static int repsEqual(int[] a, int n) {
		for (int i = a.length-1; i >= 0; i--) {
			int lastDigit = n % 10;
			if (a[i] != lastDigit) {
				return 0;
			}
			n = n / 10;
			if (n == 0) break;
		}
		return 1;
	}
}
