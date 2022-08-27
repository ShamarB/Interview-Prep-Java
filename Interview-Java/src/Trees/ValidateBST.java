package Trees;


public class ValidateBST {
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
	
	public boolean isValidBST(TreeNode root) {
        if (root == null) return false;
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidBSTHelper(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return isValidBSTHelper(root.left, min, root.val) && isValidBSTHelper(root.right, root.val, max);
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.left = new TreeNode(0);
		
		ValidateBST obj = new ValidateBST();
		boolean ans = obj.isValidBST(root);
		System.out.println(ans);
	}

}
