package java_program;

public class OOPS_class_object {

	String name;
	int age;
	
	void display() {
	System.out.println("Name is:" + name);
	System.out.println("Age is:" + age);
	System.out.println("--------------");

	
}
	public static void main(String args[]) {
		OOPS_class_object S1 = new OOPS_class_object();   // object creation
		S1.name = "ilakiya";
		S1.age = 21;
		
		S1.display();
		
		OOPS_class_object S2 = new OOPS_class_object();
		S2.name = "kee";
		S2.age = 20;
		
		S2.display();

	}
}
