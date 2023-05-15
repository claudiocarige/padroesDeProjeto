package factoryMethod.apple.hailSimple.model;

public class IPhoneX extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("HardList");
		System.out.println("\t- 6.8lin  Screen");
		System.out.println("\t- A14 chipset");
		System.out.println("\t- 6Gb RAM");
		System.out.println("\t- 256Gb Memory");
		System.out.println("\t- Color Pink");
	}

}
