package tuts20;

class Frog {
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		//this method:
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		return sb.toString();
		
		// or this method:
		return String.format("%4d: %s", id, name);
	}
}
public class Appies {
	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(3, "Roger");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}
}
