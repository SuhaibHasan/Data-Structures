package com.ds.Graph;

public class GraphApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph testGraph=new Graph(5);
		
		testGraph.addEdge(0, 1);
		testGraph.addEdge(0, 2);
		testGraph.addEdge(0, 3);
		testGraph.addEdge(1, 4);
		testGraph.addEdge(1, 3);
		testGraph.addEdge(2, 5);
		testGraph.addEdge(2, 3);
		testGraph.addEdge(3, 1);
		testGraph.addEdge(3, 4);
		testGraph.addEdge(3, 5);
		testGraph.addEdge(4, 1);
		testGraph.addEdge(4, 2);

		System.out.println("Get vCount"+testGraph.getVCount());
		
			
			Object[] adjacent = testGraph.adj(0);
			for(int i=0;i<adjacent.length;i++) {
			
			System.out.println(adjacent[i]);
			
		}
	}

}
