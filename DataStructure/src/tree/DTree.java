package tree;

public class DTree {
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
	
	private Node root;
	private String expression = "+-+abc*df";
	private int position = 0;
	
	private boolean isOperator(char c) {
		if (c=='+'||c=='-'||c=='*'||c=='/') {
			return true;
		}
		return false;
		
	}
	private Node makeTree() {
		Node node = new Node();
		char token = expression.charAt(position);
		node.setToken(token);
		position++;
		if (isOperator(token)) {
			node.setLeft(makeTree());
			node.setRight(makeTree());
		}		
		return node;
	}
	private void traverse(Node node) {
		if (node==null) return;
		
		traverse(node.getLeft());
		traverse(node.getRight());		
		System.out.println(node.getToken());
	}	
	public void build() {
		root = makeTree();
		traverse(root);
	}
}
