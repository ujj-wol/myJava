public class isStacked {

	public static void main(String[] args) {

		System.out.println(isStacked(1));
		System.out.println(isStacked(3));
		System.out.println(isStacked(6));
		System.out.println(isStacked(15));
		System.out.println(isStacked(10));
		System.out.println("");
		System.out.println(isStacked(7));
		System.out.println(isStacked(2));
		System.out.println(isStacked(4));
		System.out.println(isStacked(5));
		System.out.println(isStacked(8));
		System.out.println(isStacked(9));
		System.out.println("");
		System.out.println(isStacked(21));

	}

	static int isStacked (int n) {
		int sum = 0;
		int value = 1;

		while (sum < n) {
			sum += value;
			value++;
		}
		if (sum == n) return 1;
		return 0;
	}
}
