package tuts17;
class Machine {
	private String name;
	private int code;
	// constructor :
	public Machine() {
		this("Arnie!", 0);
		System.out.println("constructor running running running");
//		name = "Arnie!";
	}
	public Machine(String name) {
		System.out.println("second constructor running");
		this.name = name;
	}
	public Machine(String name, int code) {
		System.out.println("third constructor running");
		this.name = name;
		this.code = code;
	}
}

public class Appies {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
//		System.out.println(machine1.name);
		
		Machine machine2 = new Machine("Bertie!");
		Machine machine3 = new Machine("Chalky", 7);
	}
}
