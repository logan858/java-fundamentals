package tuts12;

// non-public classes:
class Person {
	// classes can contain data (state), subroutines (methods),

	// data: (instance variables, state)
	String name;
	int age;

	// sub-routines/methods
	void speaking() {
		for (int i = 0; i < 3; i++) {
			System.out.println("my name is " + name + ", and i'm " + age + " years old!!");			
		}
	}
	void sayHello() {
		System.out.println(("'Allo mate!"));
	}

}

// one public class, must match the name of the file: (ie, Appies.java)
public class Appies {
	public static void main(String[] args) {
		System.out.println("yo");
		System.out.println("yoooo");

		Person person1 = new Person();
		person1.name = "Joe Binder";
		person1.age = 22;

		Person person2 = new Person();
		person2.name = "Jen Binder";
		person2.age = 26;

		System.out.println(person1.name + "\t" + person2.name);
		
		// run methods:
		person1.speaking();
		person2.speaking();
		
		person1.sayHello();
	}
}
