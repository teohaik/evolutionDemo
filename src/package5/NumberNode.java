package package5;

public class NumberNode extends Node{
	
	protected Number number;

	public NumberNode(String aName, Number num) {
		super(aName);
		number  = num;
	}
	
	public Number getNumber(){
		return number;
	}
	
	public String toString(){
		return "Node: "+super.name+" Value: "+number;
	}

}
