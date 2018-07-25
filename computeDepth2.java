public class computeDepth2{

	public static void main(String[] args) {

		System.out.println(computeDepth(42));
		System.out.println(computeDepth(7));
		System.out.println(computeDepth(13));
		System.out.println(computeDepth(25));

	}

	static int computeDepth(int n) {
		int multiple = 1;
		int[] digitsContributed = new int[10];
		int digit = 0;
		int count = 0;
		int product = 0;

		for (int k = 0; k < digitsContributed.length; k++) {
			digitsContributed[k] = -1;
		}

		while (count < 10) {
			product = n * multiple;
			while (product > 0) {
				digit = product % 10;

				boolean newDigit = true;
				for (int i = 0; i < count; i++) {
					if (digitsContributed[i] == digit) {
						newDigit = false;
						break;
					}
					newDigit = true;
				}
				if (newDigit) {
					digitsContributed[count] = digit;
					count++;
				}
			product /= 10;
			}
			multiple++;
		}
		return (multiple - 1);
	}
}
