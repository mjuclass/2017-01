package treeTest;

public class DNode {
	private String value;
	private DNode left, right;
	
	public DNode() {
		this.left = null;
		this.right = null;		
	}
	public boolean isOperand() {
		if (this.value.matches("[1-9][0-9]*")) {
			return true;
		}
		return false;
	}
	public boolean isOperator() {
		if (this.value.matches("[+-x/]")) {
			return true;
		}
		return false;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public DNode getLeft() {
		return left;
	}
	public void setLeft(DNode left) {
		this.left = left;
	}
	public DNode getRight() {
		return right;
	}
	public void setRight(DNode right) {
		this.right = right;
	}

}
