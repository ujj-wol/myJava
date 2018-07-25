public class isLegalNumber{
	public static void main(String[] args){
		int[] p = new int[] {3, 2, 1};
		int result = isLegalNumber(p, 4);
		System.out.println(result);
		result = isLegalNumber(new int[] {3, 7, 1}, 6);
		System.out.println(result);

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
