package binaryTree;

public class BinaryTreeDriver {
	
	public static void main(String[] args){
		
		// testvoorbeeld 1
		
		BinaryNode node1 = new BinaryNode(1);
		BinaryNode node2 = new BinaryNode(2);
		BinaryNode node3 = new BinaryNode(3);
		BinaryNode node4 = new BinaryNode(4);
		BinaryNode node5 = new BinaryNode(5);
		BinaryNode node6 = new BinaryNode(6);
		BinaryNode node7 = new BinaryNode(7);
	
		node4.setLeft(node2);
		node4.setRight(node6);	
		node2.setLeft(node1);
		node2.setRight(node3);
		node6.setLeft(node5);
		node6.setRight(node7);
		
		BinaryTree tree = new BinaryTree(node4);				
		System.out.println("isBST: " + tree.isBST()); 
		
		
		// testvoorbeeld 2
		
		BinaryNode node1b = new BinaryNode(1);
		BinaryNode node2b = new BinaryNode(2);
		BinaryNode node3b = new BinaryNode(3);
		BinaryNode node4b = new BinaryNode(4);
		BinaryNode node5b = new BinaryNode(5);
		BinaryNode node6b = new BinaryNode(6);
		BinaryNode node7b = new BinaryNode(7);
		
		node5b.setLeft(node2b);
		node5b.setRight(node6b);	
		node2b.setLeft(node1b);
		node2b.setRight(node3b);
		node6b.setLeft(node4b);
		node6b.setRight(node7b);
		
		BinaryTree tree2 = new BinaryTree(node5b);
		System.out.println("isBST: " + tree2.isBST());		
	}
	
}
