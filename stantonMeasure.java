public class stantonMeasure{
	public static void main(String[] args){
		int result = stantonMeasure(new int[] {1});
		System.out.println(result);
		result = stantonMeasure(new int[] {0});
		System.out.println(result);
		result = stantonMeasure(new int[] {3, 1, 1, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
		System.out.println(result);
		result = stantonMeasure(new int[] {});
		System.out.println(result);
	}

	static int stantonMeasure(int[] a) {
		int count = 0;
		int stantonMeasure = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) count++;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == count) stantonMeasure++;
		}
		return stantonMeasure;
	}
}	