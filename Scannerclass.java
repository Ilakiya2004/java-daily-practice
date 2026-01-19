package java_program;
import java.util.Scanner;


public class conditonal {
	


public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a marks:");

	int marks = sc.nextInt();
	
	
	if (marks >= 90) {
	System.out.println("grade A"); }
	
	else if(marks >= 80) {
	System.out.println("grade B");}
	
	else if(marks >= 70) {
	System.out.println("grade C");}
	
	else if(marks >= 60) {
	System.out.println("grade D");}
	
	else if(marks >= 50) {
	System.out.println("grade E"); }
	
	else {
        System.out.println("Fail");
    }
	
	

	
	
	
	
	}		

}
