package tuts15;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("jumping: " + height);
	}
	public void move(String direction, double distance) {
		System.out.println("Moving: " + direction + ", distance: " + distance + " meters.");
	}
}

public class Appies {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("hi im sam");
		sam.jump(8);
		sam.move("west", 0.32);
		
		String greeting = "hellololo";
		sam.speak(greeting);
	}
}
