package java_program;

public class Exception_Handling {

	public static void main(String args[]) {
		try {
			int a = 10;
			int b = 20;
			System.out.println(a / b);		
		
	}
	catch(ArithmeticException e) {
		System.out.println("divisble by zero");
	}
	
	System.out.println("end");
}
}
