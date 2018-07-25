public class nextPerfectSquare{
	public static void main(String[] args) {
		System.out.println(nextPerfectSquare(17));
	}

	static int nextPerfectSquare(int n) {
		if (n < 0) return 0;
		int sqrt = (int)Math.sqrt(n);
		sqrt++;
		return sqrt*sqrt;
		}
}
