package com.ds.Graph;

public class BetterGraphApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BetterGraph myGraph = new BetterGraph(5);
		myGraph.addVertex("State");
		myGraph.addVertex("Avenel");
		myGraph.addVertex("Elm");
		myGraph.addVertex("Pocono");
		myGraph.addVertex("William");
		
		myGraph.addEdge("Avenel", "Pocono");
		myGraph.addEdge("State", "Elm");
		myGraph.addEdge("Elm", "Avenel");
		myGraph.addEdge("Elm", "William");
		myGraph.addEdge("William", "State");
		myGraph.addEdge("William", "Pocono");
		myGraph.addEdge("Pocono", "Elm");
		myGraph.addEdge("State", "Avenel");
		
		myGraph.print();

	}

}
