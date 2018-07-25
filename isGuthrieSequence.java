public class isGuthrieSequence{
	public static void main(String[] args){
		int result = isGuthrieSequence(new int[] {8, 4, 2, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 17, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 1});
		System.out.println(result);
		result = isGuthrieSequence(new int[] {8, 4, 2});
		System.out.println(result);

	}

	static int isGuthrieSequence(int[] a) {
		int isGuthrie = 0;
		int len = a.length;
		int[] b = new int[len];
		int n = a[0];
		int index = 0;

		if(a[len - 1] == 1) {
			while (index < len) {
				if (n % 2 == 0) {
					b[index] = n;
					n = n / 2;
				} else {
					b[index] = n;
					n = n*3 + 1;
				}
				index++;
			}

			for (int i = 0; i < len; i++) {
				if (a[i] != b[i]) {
					isGuthrie = 0;
					return isGuthrie;
					//break;
				}
			}
			isGuthrie = 1;
		}
		return isGuthrie;
	}
}
