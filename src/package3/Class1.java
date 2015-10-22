package package3;

import package2.Class2;

public class Class1 {
	
	package2.Class2 refp2c2;
	package2.Class3 refp2c3;
	
	Class4 refClass4;
	Class3 refClass3;
	
	String variable = "";
	
	
	public Class1(){
		refp2c2 = new Class2();
		refClass3 = new Class3();
		refClass4.test = "Theodore";
		int num = refClass3.getNumber();	
	}
	
	
	
	
	

}
