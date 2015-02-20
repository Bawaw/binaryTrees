package binarySearchTree;

public class BinarySearchTreeDriver {
	
	public static void main(String[] args){	
		BinarySearchTree bst = BinarySearchTreeFactory.createBST();
		System.out.println(bst.isBST());
		bst.printTree();
		System.out.println();
		bst.insert(0);
		bst.printTree();
		System.out.println();
		bst.insert(8);
		bst.printTree();
		System.out.println();
		System.out.println(bst.isBST());
	}
	
}
