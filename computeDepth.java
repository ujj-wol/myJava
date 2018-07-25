public class computeDepth{

	public static void main(String[] args) {

		System.out.println(computeDepth(13));

	}

	static int computeDepth(int n) {
		int multiple = 1;
		int[] digitsArray = new int[10];
		int index = 0;
		int digit = 0;
		int prod = 0;

		for (int k = 0; k < digitsArray.length; k++) {
			digitsArray[k] = -1;
		}

		do {
			prod = n * multiple;
			while (prod > 0) {
				digit = prod % 10;
				prod /= 10;

				for (int i = 0; i < digitsArray.length; i++) {
					if (digitsArray[i] == digit) {
						break;
					} else {
						if (i == 9) {
							digitsArray[index] = digit;
							index++;
						}
					}
				}
			}
			multiple++;
		} while (index <= 9);

		return (multiple - 1);
	}
}
