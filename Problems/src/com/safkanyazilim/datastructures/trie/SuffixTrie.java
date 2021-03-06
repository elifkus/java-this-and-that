package com.safkanyazilim.datastructures.trie;

import java.util.ArrayList;
import java.util.List;


public class SuffixTrie {
	private Node root;
	private List<Node> allLetterNodes;
	private static char END_LETTER = '$';
	
	public SuffixTrie() {
		this.allLetterNodes = new ArrayList<Node>();
		
	}
	
	public void construct(String string) {
		
		this.root = new Node();
		
		for(int i=0; i<string.length(); i++) {
			this.createChainForSuffix(string, i);
		}
	}
	
	public long findSubstringCountThatMakeNNumberOfIslands(int n) {
		
		long satisyfingSubstringCount = 0;
		
		for(Node node : this.allLetterNodes) {
			if (node.numberOfEndLeafBelow >= n) {
				//distance from node to root is length of string
				//Find end leaves
				List<Node> endLeaves = findEndLeavesUnderNode(node);
				int numberOfIslands = node.numberOfEndLeafBelow;
				
				if (numberOfIslands >= n ) {
				
					for (int i=0;i<endLeaves.size();i++) {
						for(int j=i+1; j<endLeaves.size(); j++) {
							if (Math.abs(endLeaves.get(i).lengthToRoot - endLeaves.get(j).lengthToRoot) <= node.lengthToRoot) {
								numberOfIslands--;
							}
						}
					}
					
					if (numberOfIslands == n) {
						satisyfingSubstringCount++;
					}
				}
			}
			
			
		}
		//Find path that has n or more end leaves under it, set numberOfIslands equal to leaf count
		//Find distance of end leaves. 
		//If closest distance, less than length of sought string decrease leaf count
		//Count the instances that have n island
		return satisyfingSubstringCount;
	}
	
	private List<Node> findEndLeavesUnderNode(Node node) {
		List<Node> endLeaves = new ArrayList<>();
		
		for(Edge out :node.outgoingEdges) {
			if (out.getEndNode().isEndLeaf()) {
				endLeaves.add(out.getEndNode());
			} else {
				List<Node> partialEndLeaves = findEndLeavesUnderNode(out.getEndNode());
				endLeaves.addAll(partialEndLeaves);
			}
		}
		
		return endLeaves;
	}
	
	private void createChainForSuffix(String string, int start) {
		Node currentNode = root;
		
		for(int i=start;i<string.length();i++) {
			if (currentNode.containsOutgoingEdgeWithLetter(string.charAt(i))) {
				currentNode = currentNode.getNextNodeWithLetter(string.charAt(i));
			} else {
				currentNode = currentNode.addEdgeWithLetterAndReturnEndNode(string.charAt(i));
				this.allLetterNodes.add(currentNode);
			}
		}
		
		currentNode.addEdgeWithEndLetter();
	}
	
	
	private class Node {
		private int lengthToRoot;
		private int numberOfEndLeafBelow;
		private boolean endLeaf;
		private List<Edge> outgoingEdges;
		private Edge incomingEdge;
		
		public Node() {
			this.outgoingEdges = new ArrayList<Edge>();
		}
			
		public Node addEdgeWithLetterAndReturnEndNode(char letter) {
			Node endNode = new Node();
			endNode.lengthToRoot = this.lengthToRoot + 1;
			
			Edge edge = new Edge(this, endNode, letter);
			endNode.incomingEdge = edge;
			
			this.outgoingEdges.add(edge);
			
			return endNode;
		}
		
		public void addEdgeWithEndLetter() {
			Node endNode = this.addEdgeWithLetterAndReturnEndNode(END_LETTER);
			
			Node current = endNode.incomingEdge.getStartNode();
			endNode.endLeaf = true;
			
			while (current.incomingEdge != null) {
				current.numberOfEndLeafBelow += 1;
				current = current.incomingEdge.getStartNode();
			}
			
		}
		
		public boolean isEndLeaf() {
			return this.endLeaf;
		}
		
		public boolean containsOutgoingEdgeWithLetter(char letter) {
			
			Edge edge = findEdgeInOutgoingList(letter);
			
			return (edge != null);
		}
		
	
		private Edge findEdgeInOutgoingList(char letter) {
			for (Edge edge : this.outgoingEdges) {
				if (edge.getLetter() == letter) {
					return edge;
				}
			}
			return null;
		}
		
		public Node getNextNodeWithLetter(char letter) {
			
			Edge edge = findEdgeInOutgoingList(letter);
			
			return edge.getEndNode();
		}
		
	}
	
	private class Edge {
		private Node startNode;
		private Node endNode;
		private char letter;
		
		public Edge(Node startNode, Node endNode, char letter) {
			this.letter = letter;
			this.startNode = startNode;
			this.endNode = endNode;
		}
		
		public char getLetter() {
			return this.letter;
		}
		
		public Node getStartNode() {
			return this.startNode;
		}

		public Node getEndNode() {
			return this.endNode;
		}
		@Override
		public int hashCode() {
			return 3 * this.startNode.hashCode() + 5 * (int)this.letter;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null) {
		        return false;
		    }
		    if (getClass() != obj.getClass()) {
		        return false;
		    }
			
		    Edge edge = (Edge)obj;
		    
			if (this.startNode == edge.getStartNode() && 
					this.letter == edge.getLetter()) {
				return true;
			}
			
			return false;
		}

		
		
	}
	
	

}

