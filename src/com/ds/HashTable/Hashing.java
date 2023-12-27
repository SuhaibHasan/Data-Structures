package com.ds.HashTable;

public class Hashing {
	
   String[] hashArray;
   int arraySize;
   int size=0;
   
   public Hashing(int size) {
	   
	   if(isPrime(size)) {
		   hashArray=new String[size];
		   arraySize = size;
	   }else {
		   int primeSize=getPrime(size);
		   System.out.println("Prime size is:"+primeSize);
		   hashArray=new String[primeSize];
		   arraySize = primeSize; 
	   }
   }
   
   private boolean isPrime(int size) {
	   System.out.println("Check if it's a prime number"+size);
	   for(int i=2;i<size;i++) {		   
		   if(size%i == 0) {
			   return false;
		   }
	   }
	   return true;
   }
   
   private int getPrime(int nonPrimeSize) {
	   
	   for(int i=nonPrimeSize+1;true;i++) {
		   System.out.println("Size of i:"+i);
		   if(isPrime(i)) {
			   return i;
		   }
	   }
   }
   
   private int hashingfunc1(String word) {
	   int hashVal=word.hashCode();
	   hashVal=hashVal%arraySize;
	   
	   if(hashVal<0) {
		   hashVal+=arraySize;
	   }
	   
	   return hashVal;
   }
   
   private int hashingfunc2(String word) {
	   int hashVal=word.hashCode();
	   hashVal=hashVal%arraySize;
	   
	   if(hashVal<0) {
		   hashVal+=arraySize;
	   }
	   
	   return 3 - hashVal % 3;
   }
   
   public void insert(String word) {
	   int hashVal=hashingfunc1(word);
	   int stepSize = hashingfunc2(word);
	   
	   while(hashArray[hashVal] != null) {
		   hashVal=hashVal+stepSize;
		   hashVal=hashVal%arraySize;
	   }
	   
	   hashArray[hashVal]=word;
	   size++;
   }
   
   public String find(String word) {
	   int hashVal=hashingfunc1(word);
	   int stepSize = hashingfunc2(word);
	   
	   while(hashArray[hashVal] != null) {
		   if(hashArray[hashVal].equals(word)) {
			   return hashArray[hashVal];
		   }
		   hashVal=hashVal+stepSize;
		   hashVal=hashVal%arraySize;
	   }
	   return null;
   }
   
}
