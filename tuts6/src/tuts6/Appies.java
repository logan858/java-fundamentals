package tuts6;
import java.util.Scanner;

public class Appies {
	 public static void main(String[] args) {
		// making a new Scanner object 
		Scanner input = new Scanner(System.in);
		
		// prompt
		System.out.println("Enter the correct data types: ");
		
		// waits for user input
		String newLine = input.nextLine();
		int newInt = input.nextInt();
		double newDoub = input.nextDouble();
		
		//outputs when user is done inputting
		System.out.println("text: " + newLine);
		System.out.println("integers: " + newInt);
		System.out.println("doubles: " + newDoub);
	}
}
