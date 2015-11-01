package package6;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;

public class Demo {
	
	String name = "test";
	
	public Demo(){
		
	}
	
	public void fooBase64Demo(){
		byte[] bytes = new byte[1024];
		Base64.getEncoder().encode(bytes);
	}
	
	public void fooStringDemo(){
		char[] chars = new char[100];
		String.copyValueOf(chars);
	}
	
	public void Collections(){
		ArrayList<String> list = new ArrayList<String>();
		Collections.sort(list);
	}

}
