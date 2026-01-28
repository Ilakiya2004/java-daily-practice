package java_program;

public class Encapsulation {

	private int balance;
	
	 public void setBalance(int b) {
		 if(b >= 0) {
			 balance = b;
		 }
	 }
		 public int getBalance() {
			 return balance;
		 }

	 
    public static void main(String args[]) {
			 
			 Encapsulation d1 = new Encapsulation();
			 d1.setBalance(90000);
			 System.out.println(d1.getBalance());
		 }
	 }

	 

