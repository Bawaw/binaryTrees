package binaryMinHeap;

public class BinaryMinHeap<E extends Comparable<E>> {

	private E[] heap;
	private int size;

	public BinaryMinHeap(int capacity) {
		heap = (E[]) new Comparable[capacity];
		size = 0;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < size; ++i) {
			buffer.append(heap[i] + " ");
		}
		return buffer.toString();
	}

	private void doubleCapacity() {
		E[] oldHeap = heap;
		heap = (E[]) new Comparable[oldHeap.length * 2];
		for (int i = 0; i < oldHeap.length; ++i) {
			heap[i] = oldHeap[i];
		}
	}

	public void insert(E i) {
		insert(i, size);
		size++;
	}

	// toegevoegde waarde kleiner dan ouder? verwissel
	private void insert(E i, int index) {
		if (index > 0 && i.compareTo(heap[(index - 1) / 2]) > 0) {
			heap[index] = heap[(index - 1) / 2];
			insert(i, (index - 1) / 2);
		} else
			heap[index] = i;
	}

	public E getMax() {
		E biggest = heap[0];
		int laatsteNode = (size - 1) / 2;
		for (int i = laatsteNode + 1; i < size; i++) {
			if (heap[size - i].compareTo(biggest) > 0)
				biggest = heap[size - i];
		}
		return biggest;

	}
}
