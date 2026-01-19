package java_program;
import java.util.Scanner;

public class switchcase {


public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a first number");
	 int a = sc.nextInt();
	 
		System.out.println("enter a second number");
		 int b = sc.nextInt();
		 
			System.out.println("enter a operatots (+,-,*,/);");
			 
			char op = sc.next().charAt(0);
			
			switch(op) {
			case '+':
				System.out.println("Result:"+(a+b));
			break;
			
			case '-':
			System.out.println("Result:"+(a-b));
			break;
			
			case'*':
				System.out.println("Result:"+(a*b));
				break;
				
			case'/':
				System.out.println("Result:"+(a/b));
				break;
				
				default:
				System.out.println("result is invalid");




			
			
				
				
				
	 
			
	
}
}
}
