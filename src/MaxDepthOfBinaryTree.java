public class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        if (left > right) return left;
        else return right;
    }

    public static void main(String[] args) {
        MaxDepthOfBinaryTree maxDepth = new MaxDepthOfBinaryTree();

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.left.right.left = new TreeNode(7);
        node.right = new TreeNode(5);
        node.right.left = new TreeNode(6);


        System.out.println(maxDepth.maxDepth(node));
    }
}
