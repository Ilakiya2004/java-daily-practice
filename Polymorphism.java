package java_program;

class bank{
	void interest() {
		System.out.println("general bank");
	}
}

class idbi extends bank{
	void interest() {
System.out.println("idbi interest is 90%");

}
}

class indian extends bank{
	void interest() {
System.out.println("indian interest is 80%");

}
}

public class Polymorphism{
	public static void main(String args[]) {
		bank b;
		b = new idbi();
		b.interest();
		b = new indian();
		b.interest();

		
	}
}

