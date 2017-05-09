package binarySearchTreeTest;

import java.io.IOException;

public class DTree {
	private String data = "dshuecownecnoin";
	private Node root;

	public DTree() {
		this.root = null;
	}
	public void run() {
		char c;
		for (int i=0; i<this.data.length(); i++) {
			c = this.data.charAt(i);
			System.out.println("==insert: "+c);
			root = insert(root, c);
		}
		
		try {
			c = (char) System.in.read();
			System.out.println("**search: "+c);
			search(c, root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Node insert(Node node, char c) {
		if (node == null) {
			Node newNode = new Node();
			newNode.setToken(c);
			System.out.println("newNode: "+c);
			return newNode;
		}
		if (node.getToken() > c) {
			System.out.println("goLeft: "+c);
			node.setLeft(insert(node.getLeft(), c));
		} else {
			System.out.println("goRight: "+c);
			node.setRight(insert(node.getRight(), c));			
		}
		return node;
	}
	public boolean search(char c, Node node) {
		if (node == null) {
			System.out.println("Not found: "+c);
			return false;
		}
	
		if (node.getToken() == c) {
			System.out.println("found: "+c);
			return true;
		} else if (node.getToken() > c) {
			System.out.println("left: "+ node.getToken());
			return search(c, node.getLeft());
		} else {
			System.out.println("right: "+ node.getToken());
			return search(c, node.getRight());
		}
	}
	
	public class Node {
		private Node left;
		private char token;
		private Node right;
		
		public Node() {
			this.left = null;
			this.token = '\0';
			this.right = null;
		}
		public Node getLeft() {	return left;}
		public void setLeft(Node left) {this.left = left;}
		public char getToken() {return token;}
		public void setToken(char token) {this.token = token;}
		public Node getRight() {return right;}
		public void setRight(Node right) {this.right = right;}
	};
}
