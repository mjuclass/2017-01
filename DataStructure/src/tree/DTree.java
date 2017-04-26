package tree;

public class DTree {
	private class Node {
		public Node left;
		public char token;
		public Node right;		
	}
	
	private Node root;
	private String expression = "+-+abc*df";
	private int position = 0;
	
	private Node makeTree() {
		Node node = new Node();
		
		
		
		return node;
	}
	public void build() {
		root = makeTree();
	}
}
