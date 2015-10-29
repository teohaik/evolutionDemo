package package5;

public class DataManager {
	
	private MyTree<NumberNode> numberTree;
	
	
	public DataManager(){
		numberTree = new MyTree<NumberNode>(new NumberNode("root", 1));
		
	}
	
	
	public void foo(){
		StringData[] sd = new StringData[2];
		MyList<StringData> stringDataList = new MyList<StringData>(sd);
		stringDataList.get(0);
		stringDataList.foo();
		
		numberTree.find(new NumberNode("est",2), new NumberNode("abl",3));
		
		numberTree.k = 15;
		
		Parameterized<Data> par = new Parameterized<Data>();
		
		par.t = new StringData("test", 15);
		
	}

}
