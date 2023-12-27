package com.ds.Graph;

import java.util.ArrayList;

public class Graph {
	
	private int vCount;
	private int eCount;
	private ArrayList<Integer>[] graphArrayList;
	
	public Graph(int vCount) {
		
		this.vCount=vCount;
		this.eCount=0;
		graphArrayList = new ArrayList[vCount];
		
		for(int i=0;i<vCount;i++) {			
			graphArrayList[i]=new ArrayList<Integer>();
		}
	}
	
	
	public void addEdge(int src, int dest) {
		
		graphArrayList[src].add(dest);
		eCount++;
	}

	public int getVCount() {
		return vCount;
	}
	
	public int eCount() {
		return eCount;
	}
	public Object[] adj(int src) {
		
		return graphArrayList[src].toArray();
	}
}
