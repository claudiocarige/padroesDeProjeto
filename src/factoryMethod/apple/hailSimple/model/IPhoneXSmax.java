package factoryMethod.apple.hailSimple.model;

public class IPhoneXSmax extends IPhone{

	@Override
	public void getHardware() {
		System.out.println("HardList");
		System.out.println("\t- 10.lin  Screen");
		System.out.println("\t- A15 chipset");
		System.out.println("\t- 8Gb RAM");
		System.out.println("\t- 500Gb Memory");
		System.out.println("\t- Color Blue");
	}

}
