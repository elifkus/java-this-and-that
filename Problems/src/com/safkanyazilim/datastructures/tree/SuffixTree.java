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
		this.string = string + END_LETTER;
		
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
						
					}

					remainderOfSuffixesToBeInserted--;
					first = false;
				}
			}
				
		}
		
		
		
		//remove edge $ from root node
		for (Edge edge : this.root.outgoingEdges) {
			if (edge.from == this.string.length()-1) {
				this.root.outgoingEdges.remove(edge);
				break;
			}
		}
		//replace to -1 with length of string
		
		countEndLeavesUnderNodeAndUpdateToIndex(this.root);
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
			
			if (edge != null) {
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
		
		if ( n < 1) {
			return 0l;
		}
		
		List<Node> potentialNodes = new ArrayList<Node>();
		
		if (n == 1) {
			findEndNodes(this.root, potentialNodes);
		} else {
			findNodesThatHaveAtLeastNEndLeavesBelow(this.root, potentialNodes, n);
		}
		
		long satisfyingSubstringCount = 0;
		
		for(Node node:potentialNodes) {
			//int numberOfIslands = node.numberOfEndLeavesBelow;
			
			//Do sth
			//if () {
			//	
			//}
			satisfyingSubstringCount += node.incomingEdge.to - node.incomingEdge.from;
		}
		
		
		
		return satisfyingSubstringCount;
	}
	
	private void findEndNodes(Node node, List<Node> nodes) {
		
		if (node.outgoingEdges.size() < 1) {
			nodes.add(node);
		} else {
			for(Edge edge : node.outgoingEdges) {
				findEndNodes(edge.endNode, nodes);
			}
		}
		
	}
	
	private void findNodesThatHaveAtLeastNEndLeavesBelow(Node node, List<Node> nodes, int n) {
		
		if (node.incomingEdge != null && node.numberOfEndLeavesBelow >= n) {
			nodes.add(node);
		} else {
			for(Edge edge : node.outgoingEdges) {
				findNodesThatHaveAtLeastNEndLeavesBelow(edge.endNode, nodes, n);
			}
		}
	}
	
	/*public long findSubstringCountThatMakeNNumberOfIslands(int n) {
		
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
	*/
	
	private int countEndLeavesUnderNodeAndUpdateToIndex(Node node) {
		int count = 0;
		for(Edge out : node.outgoingEdges) {
			if (out.endNode.outgoingEdges.size() < 1) {
				count++;
				if (out.to == -1) {
					out.to = this.string.length()-1;
				}
			} else {
				count += countEndLeavesUnderNodeAndUpdateToIndex(out.endNode);
			}
		}
		
		node.numberOfEndLeavesBelow = count;
		
		return count;
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
		private int numberOfEndLeavesBelow;

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
