package tree;

public class DTree {
	class Node {
		public Node left = null;
		public char c;
		public Node right = null;
	}
	private Node root;
	private String expression = "=x-*+abcd";
	private int position = 0;
	public void build() {
		root = parseExrpession();		
	}
	private Node parseExrpession() {
		Node node = new Node();
		node.c = expression.charAt(position);
		this.position++;
		System.out.println("op(" + node.c + ")" + this.expression); 
		if (this.isOPerator(node.c)) {
			node.left = parseExrpession();
			node.right = parseExrpession();
		}
		return node;
	}
	private boolean isOPerator(char c) {
		if (c=='=' || c=='+'|| c=='-'|| c=='*'|| c=='/')
			return true;
		return false;
	}

}
