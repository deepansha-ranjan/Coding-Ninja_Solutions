package CodingNinjas;

public class node_greater_than_X {


public class Solution {

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		 if (root==null)
        {
            return 0;
        }
        
        int smallOutput=countNodesGreaterThanX(root.left,x)+countNodesGreaterThanX(root.right,x);
        if (root.data>x)
        {
            return smallOutput+1;
        }
        else
        {
            return smallOutput;
        }
		//Your code goes here
	}

}
}
