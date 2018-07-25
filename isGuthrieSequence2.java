public class isGuthrieSequence2{
	public static void main(String[] args){
		int result = isGuthrieSequence(new int[] {8, 4, 2, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 17, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 2});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {1});
		System.out.println(result);

	}

	static int isGuthrieSequence(int[] a) {
		if (a[a.length - 1] != 1 || a.length <= 1) {
			return 0;
		}

		int nextVal = 0;
		for (int i = 0; i < a.length -1; i++) {
			if(a[i] % 2 == 0) {
				nextVal = a[i]/2;
			} else {
				nextVal = a[i] *3 +1;
			}

			if (nextVal != a[i+1]) return 0;
		}
		return 1;
	}
}

/*
		int nextVal = a[0];
		for (int i = 0; i < a.length; i++) {
			if (nextVal == a[i]) {
				if(a[i] % 2 == 0) {
					nextVal = a[i]/2;
				} else {
					nextVal = a[i] *3 +1;
				}
			} else {
				return 0;
			}
		}
		return 1;
*/
