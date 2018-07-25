public class matches{
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
		int start = 0;
		int len = 0;
		int end = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] > 0)
				len = p[i];
			else
				len = -p[i];
			end += len;
			for (int j = start; j < end; j++) {
				if (p[i] > 0) {
					if (a[j] <= 0) return 0;
				} else {
						if (a[j] >= 0) return 0;
				}
			}
			start += len;
		}
		return 1;
	}
}
