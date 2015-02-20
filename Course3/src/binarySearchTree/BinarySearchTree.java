package binarySearchTree;

public class BinarySearchTree {
	private class BinaryNode {
		public int data;
		public BinaryNode left, right;
		
		public BinaryNode(int data) {
			this(data, null, null);
		}
		
		public BinaryNode(int data, BinaryNode leftChild, BinaryNode rightChild) {
			this.data = data;
			this.left = leftChild;
			this.right = rightChild;
		}
	}
	
	private BinaryNode root;

	public BinarySearchTree() {
	}

	public BinaryNode getRoot() {
		return root;
	}
	

	public boolean isBST() {
		return isBST(getRoot(), Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(BinaryNode node, int min, int max) {
		if (node == null)
			return true;
		if (node.data <= min || node.data >= max)
			return false;
		return isBST(node.left, min, node.data)
				&& isBST(node.right, node.data, max);
	}
	

	public boolean lookup(int target) {
		return lookup(root, target);
	}

	private boolean lookup(BinaryNode node, int target) {
		if (node == null) {
			return false;
		}
		if (target == node.data) {
			return true;
		} else if (target < node.data) {
			return lookup(node.left, target);
		} else { // target > node.getData()
			return lookup(node.right, target);
		}
	}
	
	public void mystery() {
		if (root != null) {
			if (root.left == null && root.right == null) {
				root = null;
			} else {
				mystery(null, root);
			}
		}
	}

	private void mystery(BinaryNode prev, BinaryNode node) {
		if (node.left == null && node.right == null) {
			if (prev.left == node) {
				prev.left = null;
			} else {
				prev.right = null;
			}
			return;
		}
		if (node.left != null) {
			mystery(node, node.left);
		} else {
			mystery(node, node.right);
		}
	}
	

	public void insert(int data) {
		if(getRoot() == null)
			root = new BinaryNode(data);
		insert(data, getRoot());
	}

	private void insert(int data, BinaryNode node) {
		if (data < node.data)
			if (node.left == null)
				node.left = new BinaryNode(data);
			else
				insert(data, node.left);
		if (data > node.data)
			if (node.right == null)
				node.right = new BinaryNode(data);
			else
				insert(data, node.right);
	}
	
	public void removeMostLeft(){
		removeMostLeft(getRoot());
	}
	
	public BinaryNode removeMostLeft(BinaryNode node){
		if(node.left != null)
			node.left = removeMostLeft(node.left);
		else if(node.right != null)
			node.right = removeMostLeft(node.left);
		else
			return null;
		return node;
	}
	
	public void printTree(){
		printPreorder(getRoot());
	}
	
	private void printPreorder(BinaryNode node){
		if (node == null) return;
		printPreorder(node.left);	
		System.out.print(node.data + " ");	
		printPreorder(node.right);
	}
}