package factoryMethod.apple.hailSimple.model;

public abstract class IPhone {
	public abstract void getHardware();
	public void assemble() {
		System.out.println("Assembling all the hardwares.");
	}
	public void certificates() {
		System.out.println("Testing all certificates.");
	}
	public void pack(){
		System.out.println("Packing the device.");
	}
}
