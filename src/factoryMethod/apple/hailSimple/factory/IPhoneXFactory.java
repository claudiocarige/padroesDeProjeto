package factoryMethod.apple.hailSimple.factory;

import factoryMethod.apple.hailSimple.model.IPhone;
import factoryMethod.apple.hailSimple.model.IPhoneX;
import factoryMethod.apple.hailSimple.model.IPhoneXSmax;

public class IPhoneXFactory extends IphoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if ("standard".equals(level)) {
			System.out.println("Escolheu IPhone X Standard");
			return new IPhoneX();
		} else if ("highEnd".equals(level)) {
			System.out.println("Escolheu IPhone XS Max HighEnd");
			return new IPhoneXSmax();
		} else
			return null;
	}

}
