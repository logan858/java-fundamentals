package tuts21;

public class Machine {
	public void start() {
		System.out.println("Machine started!");
	}
	public void stop() {
		System.out.println("Machine stopped!");
	}
	
	// can access protected anywhere within the package & child classes
	protected String name = "Ex Machina";
}
