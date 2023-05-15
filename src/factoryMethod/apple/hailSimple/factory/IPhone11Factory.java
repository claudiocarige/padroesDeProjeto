package factoryMethod.apple.hailSimple.factory;

import factoryMethod.apple.hailSimple.model.IPhone;
import factoryMethod.apple.hailSimple.model.IPhone11;
import factoryMethod.apple.hailSimple.model.IPhone11Pro;

public class IPhone11Factory extends IphoneFactory{

	@Override
	protected IPhone createIPhone(String level) {
		if("standard".equals(level)) {
			System.out.println("Escolheu IPhone 11 Standard");
			return new IPhone11();
		}else if("highEnd".equals(level)){
			System.out.println("Escolheu IPhone 11 Pro HighEnd");
			return new IPhone11Pro();
			
		}else return null;
	}

}
