
public class StackOverFlowError {
	
	public static void methodOne(){
		methodTwo();
	}
	
	public static void methodTwo(){
		methodOne();
	}
	
	public static void main(String[] args) {
		methodOne();
	}

}
