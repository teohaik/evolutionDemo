package package6;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	String name = "This is a test name";
	final Map<String, Number> testMap = new HashMap<>();
	
	
	public Demo(){

	}
	
        public synchronized void synchmethod(){
            name.split(" ");
        }
        
        public void synchBlockmethod(){
            System.out.println("test bla bla ");
            int k = 6;
            int z = 5 + k;
            synchronized (testMap) {
                testMap.put("bla", 1);
                testMap.put("blabla bla ", 2);
            }
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
