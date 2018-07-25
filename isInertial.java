public class isInertial {
	public static void main(String[] args) {
		int result = isInertial(new int[]{1});
		System.out.println(result);
		result = isInertial(new int[]{2});
		System.out.println(result);
		result = isInertial(new int[]{1, 2, 3, 4});
		System.out.println(result);
		result = isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{-2, -4, -6, -8, -11});
		System.out.println(result);
		result = isInertial(new int[]{2, 3, 5, 7});
		System.out.println(result);
		result = isInertial(new int[]{2, 4, 6, 8, 10});
		System.out.println(result);
	}

	static int isInertial(int[] a) {
		// to test condition 1 & 2
		int oddCount = 0;
		if (a.length == 0) return 0;
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) oddCount++;
			if (a[i] > max) max = a[i];
		}
		if (oddCount == 0) return 0;
		if (max % 2 != 0) return 0;

		// to test condition 3
		int[] evens = new int[a.length - oddCount];
		int[] odds = new int[oddCount];
		int p = 0;
		int q = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evens[p] = a[i];
				p++;
			} else {
				odds[q] = a[i];
				q++;
			}
		}

		int maxEven2 = 0; // in case there is only one even value in the array, the second most big even would be zero
		int minOdd = odds[0];

		for (int j = 0; j < odds.length; j++) {
			if (odds[j] < minOdd) minOdd = odds[j];
		}
		for (int k = 0; k < evens.length; k++) {
			if (evens[k] > maxEven2  && evens[k] != max) maxEven2 = evens[k];
		}

		if (minOdd <= maxEven2) return 0;
		return 1;
	}
}
