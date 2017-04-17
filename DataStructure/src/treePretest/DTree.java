package treePretest;

import java.io.File;
import java.util.Scanner;

import stack.DStack;

public class DTree {
	
	private DNode root;
	private Scanner scanner;
	private DStack<DNode> stack = new DStack<DNode>();;

	private DNode getNode() {
		if (!this.scanner.hasNext())
			return null;
		String token = this.scanner.next();
		DNode newNode = new DNode();
		newNode.setValue(token);
		return newNode;
	}
	
	private void itrativeBuildSub() {
		try {
			DNode newNode = root;
			DNode popedNode = null;
			while (newNode != null) {
				if ((newNode == popedNode) || newNode.isOperand()) {
						popedNode = this.stack.pop();
					if (popedNode == null) 
						break;
					if (popedNode.getLeft() == null) {
						popedNode.setLeft(newNode);
						this.stack.push(popedNode);
						newNode = this.getNode();
					} else if (popedNode.getRight() == null) {
						popedNode.setRight(newNode);
						newNode = popedNode;
					}
				} else if (newNode.isOperator()) {
					this.stack.push(newNode);
					newNode = this.getNode();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public DNode itrativeBuild(String fileName) {
		try {
			this.scanner = new Scanner(new File(fileName));
			this.root = this.getNode();
			this.itrativeBuildSub();
			scanner.close();
			return root;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
	private DNode recursiveBuildSub() {
		DNode newNode = this.getNode();
		if (newNode == null)
			return null;
		if (newNode.isOperand()) {
			return newNode;
		}
		if (newNode.isOperator()) {
			newNode.setLeft(recursiveBuildSub());
			newNode.setRight(recursiveBuildSub());
			return newNode;
		}
		return null;
	}
	public DNode recursiveBuild(String fileName) {
		try {
			this.scanner = new Scanner(new File(fileName));
			this.root = this.recursiveBuildSub();
			scanner.close();
			return root;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
	public void traverse(DNode node) {
		if (node == null)
			return;
		System.out.print("(");
		this.traverse(node.getLeft());
		System.out.print(node.getValue());
		this.traverse(node.getRight());
		System.out.print(")");
	}

}
