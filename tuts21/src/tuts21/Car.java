package tuts21;

public class Car extends Machine {
	public void wipeWindShield() {
		System.out.println("Wiping windshield!");
	}
	//overrides parent object start method
	@Override
	public void start() {
		System.out.println("Car started!");
	}
	@Override
	public void stop() {
		System.out.println("Car stopped!");
	}
	
	public void showInfo() {
		System.out.println("car name is: " + name);
	}
	
}
