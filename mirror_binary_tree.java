package CodingNinjas;

public class mirror_binary_tree {


	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		 if (root==null)
        {
            return;
        }
        
        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
	}
	

}
