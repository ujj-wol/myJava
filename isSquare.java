public class isSquare{
	public static void main(String[] args){
		//int result = isSquare(3);
		//System.out.println(result);
    int result = isSquare(4);
		System.out.println(result);
    result = isSquare(25);
		System.out.println(result);
    result = isSquare(-4);
		System.out.println(result);
    result = isSquare(8);
		System.out.println(result);
    result = isSquare(0);
		System.out.println(result);
		System.out.println(isSquare(81));
	}

	static int isSquare(int n) {
		if (n < 0) return 0;
		int sq = 0;
      for (int i = 0; sq <= n; i++) {
        sq = i * i;
        if (sq == n) {
          return 1;
        }
      }
    return 0;
	}
}
