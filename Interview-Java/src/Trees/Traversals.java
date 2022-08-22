package Trees;

import java.util.LinkedList;
import java.util.Queue;


public class Traversals {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public static void traverseInorder(TreeNode root) {
		
		
		if (root.left != null) traverseInorder(root.left);
		System.out.print(root.val + " ");
		if (root.right != null) traverseInorder(root.right);
	}
	
	public static void traversePreorder(TreeNode root) {
		
		System.out.print(root.val + " ");
		if (root.left != null) traversePreorder(root.left);
		if (root.right != null) traversePreorder(root.right);
	}
	
	public static void traversePostorder(TreeNode root) {
		
		if (root.left != null) traversePostorder(root.left);
		if (root.right != null) traversePostorder(root.right);
		System.out.print(root.val + " ");
	}
	
	public static void traverseBFS(TreeNode root) {
		System.out.print("Breadth First Traverse: ");
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.print(current.val + " ");
			if (current.left != null) queue.add(current.left);
			if (current.right != null) queue.add(current.right);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		traverseBFS(root);
		System.out.println();
		System.out.print("Pre Order Traverse: ");
		traversePreorder(root);
		System.out.println();
		System.out.print("In Order Traverse: ");
		traverseInorder(root);
		System.out.println();
		System.out.print("Post Order Traverse: ");
		traversePostorder(root);
	}

}
