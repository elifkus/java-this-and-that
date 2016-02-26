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
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("SuffixTree [root=" + root + ", string=" + string + "]");
		sb.append("\n");
		printNode(sb, this.root);
		return sb.toString();
	}
	
	public String toString(int currentEnd) {
		StringBuilder sb = new StringBuilder(); 
		sb.append("SuffixTree [root=" + root + ", string=" + string + "]");
		sb.append("\n");
		printNode(sb, this.root, currentEnd, "");
		return sb.toString();
	}
	
	private void printNode(StringBuilder builder, Node node) {
		printNode(builder, node, this.string.length()-1, "");
	}

	private void printNode(StringBuilder builder, Node node, int currentEnd, String spacing) {
		builder.append("O");
		boolean first = true;
		for(Edge edge: node.outgoingEdges) {
			if (!first) {
				builder.append(spacing);
			}
			builder.append("--");
			int to = edge.to < 0 ? currentEnd + 1 : edge.to + 1;
			builder.append(this.string.substring(edge.from, to));
			builder.append("--");
			
			if (edge.endNode != null) {
				printNode(builder, edge.endNode, currentEnd, "     |");
			}
			
			builder.append("\n ");
			first = false;
		}
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
				
				Edge activeEdge = findActiveEdge(activePoint);
				if (activeEdge.to - activeEdge.from > activePoint.length + 1) {
					activePoint.length += 1;
				} else {
					activePoint.node = activeEdge.endNode;
					activePoint.edgeBeginningWith = null;
					activePoint.length = 0;
				}
				
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
			System.out.println(this.toString(i));
		}
		
		
		
		//remove edge $ from root node
		for (Edge edge : this.root.outgoingEdges) {
			if (edge.from == this.string.length()-1) {
				//this.root.outgoingEdges.remove(edge);
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
				if (edge.to - edge.from < point.length) {
					return edge;
				}
				
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
		
		if (node.numberOfEndLeavesBelow >= n) {
			
			if (node.incomingEdge != null) {
				nodes.add(node);
			}
			
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
			
			this.endNode.incomingEdge = this;
		}
		
		public Edge splitAt(int length) {
			int previousTo = this.to;
			this.to = this.from + length - 1;
			
			Node previousEndNode = this.endNode;
			this.endNode = new Node();
			this.endNode.incomingEdge = this;
			//new edge will be added to this node
			
			Edge newEdge = new Edge(this.to+1, previousTo, this.endNode, previousEndNode);
			
			return newEdge;
		}
		
		
		
	}
}
