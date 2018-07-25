public class matches2{
	public static void main(String[] args){
		int[] a = new int[] {1, 2, 3, -5, -5, 2, 3, 18};
		int[] p = new int[]{3, -2, 3};
		int result = matches(a, p);
		System.out.println(result);

		result = matches(a, new int[] {2, 1, -1, -1, 2, 1});
		System.out.println(result);
		result = matches(a, new int[] {1, 2, -1, -1, 1, 2});
		System.out.println(result);
		result = matches(a, new int[] {2, 1, -2, 3});
		System.out.println(result);
		result = matches(a, new int[] {1, 1, 1, -1, -1, 1, 1, 1});
		System.out.println(result);

		result = matches(a, new int[] {4, -1, 3});
		System.out.println(result);
		result = matches(a, new int[] {2, -3, 3});
		System.out.println(result);
		result = matches(a, new int[] {8});
		System.out.println(result);

	}

	static int matches (int[] a, int[] p) {
		int k = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] > 0) {
				for (int j = 0; j < p[i]; j++) {
					if (a[j+k] <= 0) return 0;
				}
			}
			if (p[i] < 0) {
				for (int j = 0; j < -p[i]; j++) {
					if (a[j+k] >= 0) return 0;
				}
			}
			if (p[i] > 0) k += p[i];
			else k += -p[i];
		}
		return 1;
	}
}
