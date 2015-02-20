package binaryTree;

public class BinaryNode {
	private int data;
	private BinaryNode left, right;
		
	public BinaryNode(int data){
		this(data, null, null);
	}
	
	public BinaryNode(int data, BinaryNode leftChild, BinaryNode rightChild) {
		this.data = data;
		this.left = leftChild;
		this.right = rightChild;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}	
	
}