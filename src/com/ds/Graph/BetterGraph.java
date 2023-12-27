package com.ds.Graph;

import java.util.ArrayList;

public class BetterGraph {
	
	public class Vertex {
		
		String vName;
		Node myList;
		
		public Vertex(String vName, Node addNode)  {
			
			this.vName=vName;
			this.myList=addNode;
		}
		
	}
	
	public class Node {
		
		Node next;
		int vertxId;
		
		public Node(int vertexId,Node newNode) {
			this.vertxId = vertexId;
			this.next=newNode;
		}
	}
	
	int index;
	Vertex[] graphArrayList;
	
	public BetterGraph(int index) {
		
		this.graphArrayList = new Vertex[index];
		index=0;
	}

	
	public void addVertex(String vertexName) {
		
		graphArrayList[index]= new Vertex(vertexName, null);
		index++;
		
	}
	
	public void addEdge(String srcVertex, String destVertex) {
		
		int srcIndex=getVertexIndex(srcVertex) ;
		int destIndex=getVertexIndex(destVertex);
		graphArrayList[srcIndex].myList=new Node(destIndex,graphArrayList[srcIndex].myList);
	}
	
	private int getVertexIndex(String vertex) {
		
		for(int i=0;i<index;i++) {
			
			if(graphArrayList[i].vName.equals(vertex)) {
				return i;
			}
		}
		return -1;
	}
	
	public void print() {
		
		for(int i=0;i<graphArrayList.length;i++) {
			
		System.out.print(graphArrayList[i].vName);
		 
		  for(Node aNode=graphArrayList[i].myList;aNode!=null;aNode=aNode.next) {
			  System.out.print("-->"+graphArrayList[aNode.vertxId].vName);
		  }
		  System.out.println();
		}
	}
}
