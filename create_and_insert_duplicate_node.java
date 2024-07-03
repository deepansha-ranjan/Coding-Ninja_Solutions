package CodingNinjas;

public class create_and_insert_duplicate_node {


	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		  if (root==null)
            return;

        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);
        //duplicateNode.data=root.data;
        BinaryTreeNode<Integer> temp=root.left;
        root.left=duplicateNode;
        duplicateNode.left=temp;
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
		
	
}
}
