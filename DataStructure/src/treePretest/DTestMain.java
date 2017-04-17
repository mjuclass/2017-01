package treePretest;

public class DTestMain {
	public void execute() {
		DTree tree = new DTree();
//		DNode root = tree.itrativeBuild("dat/tree.dat");
		DNode root = tree.recursiveBuild("dat/tree.dat");
		tree.traverse(root);
	}
}
