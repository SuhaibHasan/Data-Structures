package com.ds.BinaryTree;

public class BSTApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10, "Ten");
		bst.insert(20, "Twenty");
		bst.insert(5, "Five");
		bst.insert(39, "ThirtyNine");
		
		System.out.println("Min Key:"+bst.findMin().key);
		System.out.println("Max Key:"+bst.findMax().key);
		
		bst.remove(5);

		System.out.println("Min Key:"+bst.findMin().key);
		System.out.println("Max Key:"+bst.findMax().key);
	}

}
