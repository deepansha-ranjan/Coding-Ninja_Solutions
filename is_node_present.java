package CodingNinjas;

public class is_node_present {


	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		 if (root == null) {

		 return false;
		 }
        if (root.data == x) {
			return true;
		}
        boolean leftTree = isNodePresent(root.left, x);
        boolean rightTree = isNodePresent(root.right, x);
        return (leftTree || rightTree);
    }

    
}

