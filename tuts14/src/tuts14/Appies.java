package tuts14;

class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name + "!!");
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
}


public class Appies {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joey";
		person1.age = 25;
		
		person1.speak();
		
		System.out.println("I am " + person1.getAge() + " years old.");
		
		int years = person1.calculateYearsToRetirement();
		System.out.println("years to retirement is: " + years);
	}
	
}
