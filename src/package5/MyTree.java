package package5;

public class MyTree<N extends Node> {
	
	private N root;
	
	public int k;
	
	public MyTree(N root){
		this.root = root;
	}

	public N getRoot() {
		return root;
	}
	
	public N find(N current, N n){
		if(current.equals(n)){
			return current;
		}
		else{
			return n;
		}
	}
	
	
	

}
