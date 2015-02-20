package binaryTree;


public class BinaryTree {
		
	private BinaryNode root;

	public BinaryTree(BinaryNode root) {
		this.root = root;
	}

	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}
	
	public boolean isBST(){
		return isBST(getRoot(),Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean isBST(BinaryNode node, int min ,int max){
		if(node == null) return true;
		if(node.getData() <= min || node.getData() >= max) return false;
		return isBST(node.getLeft(),min,node.getData()) && isBST(node.getRight(),node.getData(),max);
	}
	

		
}
