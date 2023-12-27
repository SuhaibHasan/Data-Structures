package com.ds.HashTable;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashing hashMap = new Hashing(19);
		
		hashMap.insert("suhaib");
		hashMap.insert("salwa");
		hashMap.insert("haris");
		hashMap.insert("asia");
		hashMap.insert("africa");
		hashMap.insert("canada");
		hashMap.insert("india");
		hashMap.insert("zainab");
		hashMap.insert("haroon");
		hashMap.insert("hajrah");
		
		System.out.println("Value Found:"+ hashMap.find("suhaib"));
		System.out.println("Value Found:"+ hashMap.find("zebra"));
		System.out.println("Value Found:"+ hashMap.find("salwa"));
		System.out.println("Value Found:"+ hashMap.find("africa"));
		System.out.println("Value Found:"+ hashMap.find("india"));
		System.out.println("Value Found:"+ hashMap.find("haroon"));
		System.out.println("Value Found:"+ hashMap.find("hajrah"));
		System.out.println("Value Found:"+ hashMap.find("asia"));
		System.out.println("Value Found:"+ hashMap.find("tortoise"));
		System.out.println("Value Found:"+ hashMap.find("zainab"));
		System.out.println("Value Found:"+ hashMap.find("canada"));
		System.out.println("Value Found:"+ hashMap.find("haris"));
	}

}
