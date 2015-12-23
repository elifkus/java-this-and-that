package com.safkanyazilim.datastructures.tree;

import java.util.ArrayList;
import java.util.List;


public class SuffixTree {
	private static String END_LETTER = "$"; 
	
	private Node root;
	private String string;
	
	public SuffixTree() {
		this.root = new Node();
	}
	
	public void construct(String string) {
		this.string = string; // + END_LETTER;
		
		ActivePoint activePoint = new ActivePoint(this.root, null, 0);
		
		int remainderOfSuffixesToBeInserted = 0;
		
		for(int i=0; i < this.string.length(); i++) {
			remainderOfSuffixesToBeInserted++;
			
			boolean letterExistOnTree =  doesLetterExistInOutgoingEdges(activePoint, i);
			if(letterExistOnTree) {
				if (remainderOfSuffixesToBeInserted < 2) {
					activePoint.edgeBeginningWith = this.string.charAt(i);
				}
				activePoint.length += 1;
			} else {
				boolean first = true;
				
				while (!letterExistOnTree && remainderOfSuffixesToBeInserted > 0) {
					
					if (activePoint.length == 0) {
						activePoint.node.addOutgoingEdge(i, -1);
					} else {
						Edge activeEdge = findActiveEdge(activePoint);
						Edge newEdge = activeEdge.splitAt(activePoint.length);
						newEdge.startNode.addOutgoingEdge(i, -1);
						
						updateActivePointAfterEdgeSplitAndAddSuffixLink(activePoint, i, first);
						
						letterExistOnTree = doesLetterExistInOutgoingEdges(activePoint, i);
						first = false;
					}

					remainderOfSuffixesToBeInserted--;

				}
			}
			
			//Son adimda eger elde kalan stringle baslayan baska string varsa onun sonuna $ isareti konacak
		}
	}
	
	private void updateActivePointAfterEdgeSplitAndAddSuffixLink(ActivePoint activePoint, int currentIndex, boolean first) {
		
		//Burayi kontrol et cok sik olmadi
		Node prevToNode = null;
		
		if (!first) {
			Edge edge = findActiveEdge(activePoint);
			prevToNode = edge.endNode; 
		}
		
		if (this.root == activePoint.node) {
			activePoint.length--;
			activePoint.edgeBeginningWith = this.string.charAt(currentIndex - activePoint.length);
			
		}
		
		if (!first) {
			Edge edge = findActiveEdge(activePoint);
			
			if (edge!=null) {
				Node endNode = edge.endNode;
				prevToNode.addSuffixLink(endNode);	
			}
			
		}
	}
	
	
	private Edge findActiveEdge(ActivePoint point) {
		for(Edge edge : point.node.outgoingEdges) {
			if (point.edgeBeginningWith == this.string.charAt(edge.from)) {			
				return edge;
			}
		}
		
		return null;
	}
	
	
	private boolean doesLetterExistInOutgoingEdges(ActivePoint point, int currentPosition) {
		
		for(Edge edge : point.node.outgoingEdges) {
			int i = 0;
			
			while ( i <= point.length  && this.string.charAt(currentPosition - point.length + i) == this.string.charAt(edge.from + i)) {			
				i++;
			}
			
			if (i > point.length) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public long findSubstringCountThatMakeNNumberOfIslands(int n) {
		return -1;
	}
	
	private class ActivePoint {

		private Node node;
		private Character edgeBeginningWith;
		private int length;
		
		public ActivePoint(Node activeNode, Character edgeBeginningWith, int activeLength) {
			this.node = activeNode;
			this.edgeBeginningWith = edgeBeginningWith;
			this.length = activeLength;
		}
		
	}
	
	private class Node {
		private Edge incomingEdge;
		private List<Edge> outgoingEdges;
		private SuffixLink suffixLink;
		
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
		
		public void addSuffixLink(Node to) {
			this.suffixLink = new SuffixLink(this, to);
		}
	}
	
	private class SuffixLink {
		private Node startNode;
		private Node endNode;
		
		public SuffixLink(Node startNode, Node endNode) {
			this.startNode = startNode;
			this.endNode = endNode;
		}
		
	}
	
	private class Edge {
		private int from;
		private int to;
		
		private Node startNode;
		private Node endNode;
		
		public Edge(int from, int to, Node incomingNode) {
			this(from, to, incomingNode, null);
		}
		
		public Edge(int from, int to, Node incomingNode, Node outGoingNode) {
			this.from = from;
			this.to = to;
			
			this.startNode = incomingNode;
			this.startNode.outgoingEdges.add(this);
			
			if (outGoingNode == null) {
				this.endNode = new Node();	
			} else {
				this.endNode = outGoingNode;
			}
			
			endNode.incomingEdge = this;
			this.endNode.incomingEdge = this;
		}
		
		public Edge splitAt(int length) {
			int previousTo = this.to;
			this.to = this.from + length;
			
			Node previousEndNode = this.endNode;
			this.endNode = new Node();
			//new edge will be added to this node
			
			Edge newEdge = new Edge(this.to, previousTo, this.endNode, previousEndNode);
			
			return newEdge;
		}
		
		
		
	}
}
