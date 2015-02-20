package binarySearchTree;

public class BinarySearchTreeDriver {
	
	public static void main(String[] args){	
		BinarySearchTree bst = BinarySearchTreeFactory.createBST();
		System.out.println(bst.getMax());
		System.out.println(bst.lookupIterate(4));
	}
	
}
