package tuts5;

public class Appies {
	public static void main(String[] args) {
//		boolean cond = 1 == 2;
//		
//		System.out.println(cond);
		
		int myInt = 20;
		
		if(myInt < 30) {
			System.out.println("yup, it true plus it's small");			
		} else if (myInt < 100) {
			System.out.println("Yup, it true");
		} else  {
			System.out.println("nope, it false");
		}
		
		
		while (myInt < 50) {
			System.out.println("looping int: " + myInt);
			if (myInt == 45) {
				System.out.println("Breaking loop!");
				break;
			}
			
			myInt++;
			System.out.println("running...");
		}
	}
}
