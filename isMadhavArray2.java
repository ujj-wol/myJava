public class isMadhavArray2 {
	public static void main(String[] args) {
		int result = isMadhavArray(new int[]{2, 1, 1});
		System.out.println(result);
		/*result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
		System.out.println(result);
		result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
		System.out.println(result);
		result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
		System.out.println(result);
		result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
		System.out.println(result);*/
	}

	static int isMadhavArray(int[] a) {
    int p = 1;
    int q = 1;
    boolean isMad = false;

    while (p <= a.length) {
      p = q*(q+1)/2;
      q++;
      if (p == a.length) isMad = true;
    }

			if (isMad) {
				int count = 1;
				int sum = 0;
				int n = 2;
				while (count < a.length) {
					for (int i = count; i < count + n; i++) {
						sum = sum + a[i];
					}
					if (a[0] != sum) return 0;
					count = count + n;
					n++;
					sum = 0;
				}
				return 1;
			}
      return 0;
		}
}
