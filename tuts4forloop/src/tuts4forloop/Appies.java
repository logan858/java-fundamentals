package tuts4forloop;

public class Appies {
	public static void main(String[] args) {
		
		// before first ; code executes before the loop, for the first time only
		// in second ; checks this condition before running loop
		// in third ; code executes after iteration of the loop
		for(int i = 0; i < 5; i++) {
//			System.out.println("the value of i is: " + i);
			// printf takes two arguments: the %d specifies the type of the second arg, (\n is new line)
			System.out.printf("the value of i is:\n %d\n", i);
		}
	}
}
