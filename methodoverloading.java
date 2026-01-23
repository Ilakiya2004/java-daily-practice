package java_program;

public class Method_overloading {

	static void add(int a, int b) {
		System.out.println(a + b);
	}
	static void add(double a, double b) {
		System.out.println(a + b);
	}
	static void add(int a, int b ,int c) {
		System.out.println(a + b + c);
	}
	static void add(double a, double b,double c) {
		System.out.println(a + b + c);
	}
	static void add(int a, int b,int c,int d) {
		System.out.println(a +b + c + d);
	}
	static void add(double a, double b,double c,double d) {
		System.out.println(a + b + c + d);
	}
	public static void main(String args[]){
		
		add(10,20);
		add(2.5,5.8);
		add(48,58,65);
		add(8.5,6.85,258.56);
		add(8569,58745,2658,5478);
		add(874.6587,45874.2365,8475.59745,58746.587469);
	}
	
}
