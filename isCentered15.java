public class isCentered15{
	public static void main(String[] args){
		int result = isCentered15(new int[] {3, 2, 10, 4, 1, 6, 9});
		System.out.println(result);
		result = isCentered15(new int[] {2, 10, 4, 1, 6, 9});
		System.out.println(result);
		result = isCentered15(new int[] {3, 2, 10, 4, 1, 6});
		System.out.println(result);
		result = isCentered15(new int[] {1,1,8, 3, 1, 1});
		System.out.println(result);
		result = isCentered15(new int[] {9, 15, 6});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 2, 2, 1, 1});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 15 -1,-1});
		System.out.println(result);
	}

	static int isCentered15(int[] a) {
		int isCentered = 0;
		int start = 0;
		int trackI = 0;
		do {
			int sum = 0;
			for (int i = start; i < a.length && sum < 15; i++) {
				sum += a[i];
				trackI = i;
			}
			if (sum == 15 && start == (a.length-1) - (trackI)) {
				isCentered = 1;
				break;
			}
			start++;
		} while (start <= a.length/2);
		return isCentered;
	}
}
