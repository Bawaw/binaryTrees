package binaryTree;
/*todo
 * isBST()
 * insert minHeap
 * delete minHeap
 */
public class BinaryNode<E> {
	private E data;
	private BinaryNode<E> left, right;
	
	public BinaryNode(E data){
		this(data, null, null);
	}
	
	public BinaryNode(E data, BinaryNode<E> left, BinaryNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public E getData() {
		return data;
	}

	public BinaryNode<E> getLeft() {
		return left;
	}

	public BinaryNode<E> getRight() {
		return right;
	}
	
	public void setData(E data){
		this.data = data;
	}

	public void setLeft(BinaryNode<E> left){
		this.left = left;
	}
	
	public void setRight(BinaryNode<E> right){
		this.right = right;
	}
	
	public String toString(){
		return data.toString();
	}	
	
}
