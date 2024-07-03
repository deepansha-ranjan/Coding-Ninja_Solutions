package CodingNinjas;

public class sum_of_nodes {



	public static int getSum(BinaryTreeNode<Integer> root) {
		 if (root==null)
        {
            return 0;
        }
        int smallSum=getSum(root.left)+getSum(root.right);
        return root.data+smallSum;
		//Your code goes here.
	}


}
