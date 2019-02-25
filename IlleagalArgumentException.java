
public class IlleagalArgumentException {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.setPriority(10);
		t.setPriority(100);
	}

}
