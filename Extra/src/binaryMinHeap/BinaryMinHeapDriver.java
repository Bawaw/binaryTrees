package binaryMinHeap;

public class BinaryMinHeapDriver {
	
	public static void main(String[] args){
		BinaryMinHeap<Integer> heap = new BinaryMinHeap<Integer>(7);
		for(int i=7; i>=1;--i){		
			heap.insert(i);
			System.out.println(heap);
		}
	}
	
}
