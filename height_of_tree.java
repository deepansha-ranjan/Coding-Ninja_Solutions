package CodingNinjas;

public class height_of_tree {


	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;

		}
		
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

   

}

