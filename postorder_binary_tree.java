package CodingNinjas;

public class postorder_binary_tree {


	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		  if (root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
	}


}
