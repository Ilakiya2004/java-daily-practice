package java_program;

class A{
	void student1() {
		System.out.println("class A");
	}
}

class B extends  A{
	void student2() {
		System.out.println("class B");
	}
}

class C extends B{
	void student3() {
		System.out.println("class C");
	}
}

class D extends C{
	void student4() {
		System.out.println("class D");
	}
}

class E extends D{
	void student5() {
		System.out.println("class E");
	}
}

public class Inheritance{
	public static void main(String args[]) {
		E obj = new E();
		
		obj.student1();
		
		obj.student2();

		obj.student3();

		obj.student4();

		obj.student5();

	}
	
}
