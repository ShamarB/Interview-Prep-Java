/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 */
package Trees;

public class LowestCommonAnsBST {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		root.left.right.left = new TreeNode(3);
		root.left.right.right = new TreeNode(5);
		
		LowestCommonAnsBST obj = new LowestCommonAnsBST();
		TreeNode ans = obj.lowestCommonAncestor(root, root.left, root.left.right);
		System.out.println(ans.val);
	}
}


