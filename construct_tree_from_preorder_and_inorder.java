package CodingNinjas;

public class construct_tree_from_preorder_and_inorder {


	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		 BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0 ,preOrder.length-1, 0, inOrder.length-1);
    	return root;
        
	}
    
    public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder,int siPre, int eiPre, int siIn, int eiIn)
    {
        //Base case - If number of elements in the pre-order is 0
    	if (siPre>eiPre)
    	{
    		return null;
    	}
    	
    	//Defining the root node for current recursion
    	int rootData=preorder[siPre];
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    	
    	//Finding root data's location in Inorder (Assuming root data exists in Inorder)
    	int rootIndexInorder=-1;
    	for (int i=siIn;i<=eiIn;i++)
    	{
    		if (rootData==inorder[i])
    		{
    			rootIndexInorder=i;
    			break;
    		}
    	}
    	    	
    	//Defining index limits for Left Subtree Inorder
    	int siInLeft=siIn;
    	int eiInLeft=rootIndexInorder-1;
    	
    	//Defining the index limits for Left Subtree Preorder
    	int siPreLeft=siPre+1;
    	int leftSubTreeLength = eiInLeft - siInLeft + 1;
    	int eiPreLeft=(siPreLeft)+(leftSubTreeLength-1);
    	
    	//Defining index limits for Right Subtree Inorder
    	int siInRight=rootIndexInorder+1;
    	int eiInRight=eiIn;
    	
    	//Defining index limits for Right Subtree Preorder
    	int siPreRight=eiPreLeft+1;
    	int eiPreRight=eiPre;
    	
    	BinaryTreeNode<Integer> leftChild = buildTree(preorder, inorder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
    	BinaryTreeNode<Integer> rightChild = buildTree(preorder, inorder, siPreRight, eiPreRight, siInRight, eiInRight);
    	root.left=leftChild;
    	root.right=rightChild;
    	return root;
		
	}


}
