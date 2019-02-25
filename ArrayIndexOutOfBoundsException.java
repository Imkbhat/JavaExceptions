
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int[] x =new int[10];
		System.out.println(x[0]);
		System.out.println(x[100]);
		System.out.println(x[-100]);
	}

}
