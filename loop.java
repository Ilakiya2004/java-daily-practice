package java_program;
import java.util.Scanner;

public class loop {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in)	;
	System.out.println("Enter a number:");
	int num = sc.nextInt();
	for(int i = 1;i <=1000;i++) {
		System.out.println(num +  "x" + i + "=" + (num*i));
	}
		
}}
