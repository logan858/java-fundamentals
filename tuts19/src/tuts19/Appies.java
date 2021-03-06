package tuts19;

public class Appies {
	public static void main(String[] args) {
		
		//inefficient: string's are immutable in java, and doing this makes a new string and re-assigns 'info' to it, using tons of memory
		String info = "";
		info += "My name is Bobby";
		info += " ";
		info += "I am a builder!";
		
		System.out.println(info);
		
		//better:
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer!");
		
		System.out.println(sb);
		
		//even better, using refs & method chaining:
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.")
		.append(" ")
		.append("I'm a sky diver!");
		
		System.out.println(s);
		
		// string formatting :
		System.out.print("Here is some text.\tThat was a tab!\nThat was a new line!");
		System.out.println("more text");
		
		System.out.printf("\ttotal cost %-10d;\n\t quantity is %25d\n", 56, 14);
		
		for(int i = 0; i <20; i++) {
			System.out.printf("%2d: %s\n", i, "yoo text");
		}
		
		System.out.printf("Total value: %.3f\n", 5.75);
		System.out.printf("Total value: %8.1f\n", 345.21375);
	}
}
