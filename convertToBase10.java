public class convertToBase10{
	public static void main(String[] args){
		int result = convertToBase10(new int[] {1, 0, 1, 1}, 2);
		System.out.println(result);
		result = convertToBase10(new int[] {1, 1, 2}, 3);
		System.out.println(result);
		result = convertToBase10(new int[] {3, 2, 5}, 8);
		System.out.println(result);
		result = convertToBase10(new int[] {3, 7, 1}, 6);
		System.out.println(result);

	}

	static int convertToBase10(int[] a, int base) {
		int len = a.length;
		int sum = 0;

		if (isLegalNumber(a, base) == 0) return sum;

		for (int i = 0; i < len; i++) {
			sum += a[i] * Math.pow(base, len-1-i);
		}
		return sum;
	}

	static int isLegalNumber(int[] a, int base) {
		int isLegal = 1;
		for (int index = 0; index < a.length; index++) {
			if (a[index] >= base) {
				isLegal = 0;
				break;
			}
		}
		return isLegal;
	}
}
