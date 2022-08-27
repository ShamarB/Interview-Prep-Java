package Trees;

public class DiameterOfBinaryTree {
	
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
	
	int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
    
    private int dfs(TreeNode node) {
        int left = 0;
        int right = 0;
        
        if (node.left != null) {
            left = dfs(node.left);
        }
        
        if (node.right != null) {
            right = dfs(node.right);
        }
        
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		DiameterOfBinaryTree obj = new DiameterOfBinaryTree();
		int ans = obj.diameterOfBinaryTree(root);
		System.out.println(ans);
	}

}
