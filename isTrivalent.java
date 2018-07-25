public class isTrivalent {

	public static void main(String[] args) {

		System.out.println(isTrivalent(new int[] {22, 19, 10, 10, 19, 22, 22, 10}));
		System.out.println(isTrivalent(new int[] {1, 2, 2, 2, 2, 2, 2} ));
		System.out.println(isTrivalent(new int[] {2, 2, 3, 3, 3, 3, 2, 41, 65} ));
		System.out.println(isTrivalent(new int[] {-1, 0, 1, 0, 0, 0} ));
		System.out.println(isTrivalent(new int[] {} ));
		System.out.println(isTrivalent(new int[] { 2147483647, -1, -1, -2147483648}));

  }

// *Note: -12 % 10 = -2 and -12 / 10 = -1
  static int isTrivalent(int[] a) {
		if (a.length == 0) return 0;
		int count = 1;
		int[] newArray = new int[4];
		newArray[0] = a[0];

		boolean isUnique = true;
		for (int p = 1; p < a.length; p++) {
			for (int i = 0; i < count; i++) {
				if (a[p] == newArray[i]) {
					isUnique = false;
					break;
				}
				isUnique = true;
			}
			if (isUnique) {
				newArray[count] = a[p];
				count++;
			}
			if (count > 3) return 0;
		}
		if (count < 3) return 0;
		return 1;
  }
}
