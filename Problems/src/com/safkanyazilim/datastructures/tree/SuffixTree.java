package com.safkanyazilim.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class SuffixTree {

	private Node root;
	
	public SuffixTree() {
		this.root = new Node();
	}
	
	public void construct(String string) {
		
		int currentPosition = 0;
		Node currentNode = this.root;
		
		for(int i=0; i<string.length();i++) {
			currentPosition +=1;
			//check if letter exists already
			//else
				//increment all edges with one
				for(Edge edge : currentNode.outgoingEdges) {
					edge.to = currentPosition;
				}
				
				currentNode.addOutgoingEdge(i, i);
			
		}
	}
	
	public long findSubstringCountThatMakeNNumberOfIslands(int n) {
		return -1;
	}
	
	private class Node {
		private Edge incomingEdge;
		private List<Edge> outgoingEdges;
		
		public Node() {
			this.outgoingEdges = new ArrayList<Edge>();
		}
		
		public Node addOutgoingEdge(int startPosition, int endPosition) {
			Edge edge = new Edge(startPosition, endPosition, this);
			return edge.endNode;
		}
		
		public List<Edge> getEdgeList() {
			return this.outgoingEdges;
		}
	}
	
	private class Edge {
		private int from;
		private int to;
		
		private Node startNode;
		private Node endNode;
		
		public Edge(int from, int to, Node incomingNode) {
			this.from = from;
			this.to = to;
			
			this.startNode = incomingNode;
			this.startNode.outgoingEdges.add(this);
			
			this.endNode = new Node();
			this.endNode.incomingEdge = this;
		}
		
		
	}
}
