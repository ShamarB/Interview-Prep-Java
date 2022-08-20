package Trees;

import java.util.*;

public class AveragePerLevel {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.left = new TreeNode(7);
		
		System.out.println(getAverages(root));

	}
	
	public static List<Double> getAverages(TreeNode root) {
		List<Double> result = new ArrayList<>();
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			int count = 0;
			double sum = 0;
			
			TreeNode p;
			
			for (int i = 0; i < count; i++) {
				p = queue.poll();
				sum += p.val;
				if (p.left != null) queue.add(p.left);
				if (p.right != null) queue.add(p.right);
			}
			result.add(sum / (double)count);
		}
		return result;
	}
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int v) {
			this.val = v;
		}
	}

}
