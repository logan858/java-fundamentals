package tuts9;

public class Appies {
	public static void main(String[] args) {
		//value type, value variable
		int value = 7;
		
		// reference variable, reference to an array of integers
		int[] values;
		
		values = new int[3];
		
		System.out.println(values[1]);
		
		values[0] = 10;
		values[1] = 56;
		values[2] = 20;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		
		// or....
		
		int[] numbers = {5, 6, 7};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
