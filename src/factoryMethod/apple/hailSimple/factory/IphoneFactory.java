package factoryMethod.apple.hailSimple.factory;

import factoryMethod.apple.hailSimple.model.IPhone;

public abstract class IphoneFactory {
	public IPhone orderIPhone(String level) {
		IPhone device = null;
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		return device;
	}
	protected abstract IPhone createIPhone(String level);
}
