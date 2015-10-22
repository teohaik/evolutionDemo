package package5;

public abstract class Node {

	protected String name;
	
	protected Node leftChild, rightChild;
	
	
	public Node(String aName) {
		this.name = aName;
		leftChild = null;
		rightChild = null;
	}
	
	public String getName() {
		return name;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}
	
	public Node getRightChild() {
		return rightChild;
	}
	
	public void addLeftChild(Node child){
		if(leftChild == null){
			this.leftChild = child;
		}
		else{
			child.leftChild = leftChild;
			this.leftChild = child;
		}
	}
	
}
