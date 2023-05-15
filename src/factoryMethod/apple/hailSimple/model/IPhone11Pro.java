package factoryMethod.apple.hailSimple.model;

public class IPhone11Pro extends IPhone{

	@Override
	public void getHardware() {
		System.out.println("HardList");
		System.out.println("\t- 7.lin  Screen");
		System.out.println("\t- A14 chipset");
		System.out.println("\t- 8Gb RAM");
		System.out.println("\t- 500Gb Memory");		
	}

}
