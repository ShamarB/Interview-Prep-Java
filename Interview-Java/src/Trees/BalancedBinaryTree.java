package Trees;


public class BalancedBinaryTree {
	
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
	
	public boolean isBalanced(TreeNode root) {
        // check to make sure the tree has values
        if (root == null) return true;
        //return the result from the height method to get if the tree is balanced or not
        return height(root) != -1;
    }
    //write a method that will return -1 if the height is unbalanced
    public int height(TreeNode node) {
        if (node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        int balanceFactor = Math.abs(left - right);
        
        if (balanceFactor > 1 || left == -1 || right == -1) return -1;
        return 1 + Math.max(left, right);
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		BalancedBinaryTree obj = new BalancedBinaryTree();
		boolean ans = obj.isBalanced(root);
		System.out.println(ans);
	}
}
