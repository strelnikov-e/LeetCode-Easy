
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

       public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> nodes = new ArrayList<>();
           inorderTraversal(root, nodes);
           return nodes;
       }

       private void inorderTraversal(TreeNode root, List<Integer> nodes) {
           if (root == null) return;
           inorderTraversal(root.left, nodes);
           nodes.add(root.val);
           inorderTraversal(root.right, nodes);
       }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(5);
        node.right.left = new TreeNode(6);


        System.out.println(traversal.inorderTraversal(node));
    }
}
