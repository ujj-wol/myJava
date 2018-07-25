public class solve10_new {
	public static void main(String[] args){
		int[] result = solve10();
		for(int number : result){
			System.out.println(number);
		}
	}

	static int[] solve10() {
		//boolean factorialFound = false;
		int num = 10;
		int tenFactorial = 1; //3628800
		for(int i = 1; i <= num; i++){
			tenFactorial = tenFactorial * i;
		}

		for (int x = 1; x < num; x++) {
			int xFactorial = 1;
			for (int i = 1; i <= x; i++) {
				xFactorial *= i;
			}

			for (int y = 1; y < num; y++) {
				int yFactorial = 1;
				for (int j = 1; j <= y; j++) {
					yFactorial *= j;
				}

				if (xFactorial + yFactorial == tenFactorial) {
						return new int[] {x, y};
				}
			}
		}
		return new int[] {0, 0};
	}
}
