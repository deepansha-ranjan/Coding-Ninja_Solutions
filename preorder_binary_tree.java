package CodingNinjas;

public class preorder_binary_tree {



	public static void preOrder(BinaryTreeNode<Integer> root) {
	  if (root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
	}

}

