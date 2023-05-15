package factoryMethod.apple.hailSimple.model;

public class IPhone11 extends IPhone{

	@Override
	public void getHardware() {
		System.out.println("HardList");
		System.out.println("\t- 6.lin  Screen");
		System.out.println("\t- A13 chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}

}
