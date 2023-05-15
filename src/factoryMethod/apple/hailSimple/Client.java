package factoryMethod.apple.hailSimple;

import factoryMethod.apple.hailSimple.factory.IPhone11Factory;
import factoryMethod.apple.hailSimple.factory.IPhoneXFactory;
import factoryMethod.apple.hailSimple.factory.IphoneFactory;
import factoryMethod.apple.hailSimple.model.IPhone;

public class Client {
	
	public static void main (String[] args) {
		
		IphoneFactory genXFactory = new IPhoneXFactory();
		IphoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("########Ordering IPhone X");
		IPhone iPhone = genXFactory.orderIPhone("highEnd");
		System.out.println(iPhone);
		
		System.out.println("\n\n########Ordering IPhone 11 ");
		IPhone iPhone2 = gen11Factory.orderIPhone("standard");
		System.out.println(iPhone2);		
	}
}
