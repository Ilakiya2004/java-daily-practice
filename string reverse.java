package java_program;
import java.util.Scanner;

public class string {


public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter your name:");
	
	String name = sc.nextLine();
	
	 String reverse = "";
	 
	 for(int i = name.length() -1; i >= 0;i--) {
		 
		 reverse = reverse + name.charAt(i);
	 }
		 
		 System.out.println("Reverse string is:" + reverse);
	        sc.close();

	 
	
}
}
