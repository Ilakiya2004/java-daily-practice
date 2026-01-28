package java_program;

public class this_keyword {

	String name;
	int age;
	int salary;
	
	this_keyword(String name, int age, int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);

		System.out.println(salary);

	}
	public static void main(String args[]) {
		
		this_keyword s1 = new this_keyword("shinchan", 20, 400000);
		s1.display();}
}

