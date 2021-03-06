package tuts18;
class Thing{
	public String name;
	//final keyword is java's version of constant
	public final static int LUCKY_NUMBER = 7;
	// static method belongs to the class, not the object instances directly
	public static String description; 
	
	public static int count = 0;
	//constructor that counts the number of instances:
	// & create an id for each instance:
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	
	
	public void showName() {
		System.out.println(description + " : " + name);
	}
	
	public static void showInfo() {
		System.out.println("tester");
		//static cant access instance methods
		//wont work: System.out.println(name);
	}
	
}


public class Appies {
	public static void main(String[] args) {
		Thing.description = "i am a thing";
		System.out.println(Thing.description);
		
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		
		thing1.name = "bob";
		thing2.name = "sue";
		
		System.out.println(thing1.name + " : " + thing1.id);
		System.out.println(thing2.name + " : " + thing2.id);
		
		thing1.showName();
		thing2.showName();
		
		
		System.out.println(Math.PI);
		
		// constant values are represented by all upper case:
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println(Thing.count);
	}
}
