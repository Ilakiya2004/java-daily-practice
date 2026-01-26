package java_program;

public class Constructor {

	String name;
	int age;
	 
	Constructor(){
		name = "kavi";
		 age = 15;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);

	}
	public static void main(String args[]) {
		Constructor s1= new Constructor();
		 s1.name = "kavi";
		s1.age = 15;
		s1.display();
}
}
