package com.ds.BinaryTree;

public class BinarySearchTree {
	
	private Node root;
	
	public void insert(int key, String value) {
		
		Node newNode = new Node(key,value);
		
		if(root == null) {
			root = newNode;
		}
		else {
			
			Node current= root;
			Node parent;
			
			while(true) {
				parent = current;
				if(key<current.key) {
					current = current.leftChild;
					if(current== null) {
						parent.leftChild = newNode;
						return;
					}
				}
				else {					
					current = current.rightChild;
					if(current==null) {
						parent.rightChild=newNode;
						return;
					}
				}
				
			}

		}
		
	}
	
	public Node findMin() {
		
		Node currentNode=root;
		Node minNode = null;
		while(currentNode != null){
			minNode=currentNode;
			currentNode = currentNode.leftChild;
		}
		
		return minNode;
	}
	
	public Node findMax() {
		
		Node currentNode=root;
		Node maxNode = null;
		while(currentNode != null){
			maxNode=currentNode;
			currentNode = currentNode.rightChild;
		}
		
		return maxNode;
	}

	public boolean remove(int key) {
		
		Node currentNode= root;
		Node parentNode = null;
		boolean isLeftChild = false;
		
		while(currentNode.key!=key) {			
			parentNode = currentNode;
			
			if(key < currentNode.key)
			{
				currentNode = currentNode.leftChild;
				isLeftChild = true;
			}
			else
			{
				currentNode = currentNode.rightChild;
				isLeftChild = false;
			}
			if(currentNode == null) {
				return false;
			}
			
		}
		
		Node nodeToDelete = currentNode;
		
		if(nodeToDelete.leftChild == null & nodeToDelete.rightChild==null) {
			if(nodeToDelete == root) {
				root=null;
			}
			else if(isLeftChild) {
				parentNode.leftChild=null;
			}
			else {
				parentNode.rightChild=null;
			}					
		}
		else if(nodeToDelete.leftChild==null) {
			
			if(nodeToDelete==root) {
				root = nodeToDelete.rightChild;				
			}
			else if(isLeftChild) {
				parentNode.leftChild=nodeToDelete.rightChild;
			}
			else {
				parentNode.rightChild = nodeToDelete.rightChild;
			}
		}
		else if(nodeToDelete.rightChild==null) {
			
			if(nodeToDelete==root) {
				root = nodeToDelete.leftChild;				
			}
			else if(isLeftChild) {
				parentNode.leftChild=nodeToDelete.leftChild;
			}
			else {
				parentNode.rightChild = nodeToDelete.leftChild;
			}
		}
		else
		{
			Node successor = getSuccesorNode(nodeToDelete);
			if(nodeToDelete == root) {
				root = successor;
			} else if(isLeftChild) {
				parentNode.leftChild = successor;
			} else {
				parentNode.rightChild = successor;
			}
			successor.leftChild=nodeToDelete.leftChild;
			
		}
		
		return true;
	}
	
	private Node getSuccesorNode(Node nodeToDelete) {
		
		Node successorParent = nodeToDelete;
		Node successor= nodeToDelete;
		
	    Node currentNode = nodeToDelete.rightChild;
	    while(currentNode!=null) {
	    	successorParent=successor;
	    	successor=currentNode;
	    	currentNode=currentNode.leftChild;
	    }
	    
	    if(successor!=nodeToDelete.rightChild) {
	    	successorParent.leftChild=successor.rightChild;
	    	successor.rightChild=nodeToDelete.rightChild;
	    }
	    
	    return successor;
	}
}
