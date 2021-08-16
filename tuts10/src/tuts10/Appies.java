package tuts10;

public class Appies {
	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//primitive types have lower case, it will have 32 bytes
		int value = 0;
		//not a primitive type, uppercase.  allocating only enough memory for a reference to a string, because we wont know how much space a string might be.
		String text = null;
		System.out.println(text);
		
		String[] texts = new String[2];
		System.out.println(texts[0]);
		
		// now we're allocating memory for a string, pointing the reference at what really contains the string
		texts[0] = "one";
	}
}
