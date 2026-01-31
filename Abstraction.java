package java_program;

abstract class animal{
	abstract void sound();
	void eat() {
		System.out.println("animals are eating");
	}
	
}

class dog extends animal{
	void sound() {
		System.out.println("dog is barking");

	}
}

public class Abstraction{
	public static void main(String args[]) {
		animal b = new dog();
		b.sound();
		b.eat();
	}
}

