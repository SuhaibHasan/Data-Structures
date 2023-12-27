package com.ds.MaxHeap;

public class MaxHeap {
	
	private Node[] heapArray;
	private int maxSize;
	private int currentArraySize;
	
	public MaxHeap(int size) {
		
		this.maxSize = size;
		this.currentArraySize = 0;
		heapArray = new Node[size];
		
	}
	
	public int getSize() {
		return currentArraySize;
	}
	
	public boolean isEmpty() {
		return(currentArraySize==0);
	}
	
	public boolean inserKey(int key) {
		
		if(currentArraySize == maxSize) {
			return false;
		}
		
		Node insertNode = new Node(key);
		heapArray[currentArraySize]= insertNode;
		trickleUp(currentArraySize);
		
		currentArraySize ++;
		return true;
	}
	
	private void trickleUp(int idx) {
		
		Node nodeToInsert=heapArray[idx];
		int parentIndex=(idx-1)/2;
		
		while(idx>0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()) {
			heapArray[idx]=heapArray[parentIndex];
			idx=parentIndex;
			parentIndex=(parentIndex-1)/2;
		}
		
		heapArray[idx]=nodeToInsert;
	}
	
	public Node remove() {
		
		if(isEmpty()) {
			return null;
		}
		
		Node nodeToRemove = heapArray[0];
		heapArray[0] = heapArray[--currentArraySize];
		trickleDown(0);
		
		return nodeToRemove;
	}
	
	private void trickleDown(int idx) {
		
		Node topNode=heapArray[0];
		int largeChildIdx;
		
		while(idx<currentArraySize/2) {
			int leftChildIndex = 2*idx+1;
			int rightChildIndex= 2*idx+2;
			
			if(rightChildIndex<currentArraySize &&
				heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()) {
				largeChildIdx=rightChildIndex;
			}else {
				largeChildIdx=leftChildIndex;
			}
			
			if(topNode.getKey()>heapArray[largeChildIdx].getKey()) {
				break;
			}
			
			heapArray[idx]=heapArray[largeChildIdx];
			idx=largeChildIdx;
		}

		heapArray[idx]=topNode;
		
	}

}
