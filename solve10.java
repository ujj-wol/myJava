public class solve10 {
	public static void main(String[] args){
		int[] result = solve10(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
		for(int number : result){
			System.out.println(number);
		}
	}

	static int[] solve10(int[] a) {

		int tenFactorial = 1;
		for(int i = 1; i <= 10; i++){
			tenFactorial = tenFactorial * i;
		}

		int[] fact = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			fact[i] = 1;
			for (int j = a[i]; j > 1; j--) {
				fact[i] *= j;
			}
		}

		for (int j = 0; j < fact.length; j++) {
			for (int k = j+1; k < fact.length; k++) {
				if (fact[j] + fact[k] == tenFactorial) {
				//if (fact[j] + fact[k] == Math.fact(10)) {
					return new int[] {fact[j], fact[k]};
				}
			}
		}
		return new int[] {0, 0};
	}
}
