
public class ClassCastException {

	public static void main(String[] args) {
		
		/*String s = new String("bhaskar");
		Object o = (Object)s;
		System.out.println(o);*/
		
		/*Object obj = new String("kiran");
		String s = (String) obj;*/
		
		Object o = new Object();
		String s = (String)o;
		
		System.out.println(s);
	}

}
