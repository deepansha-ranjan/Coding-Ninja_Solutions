package CodingNinjas;

public class path_sum_root_to_leaf {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
	  String arr="";
        rootToLeafPathsSumToK(root,k,arr);
	}
    
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String arr)
    {
        if (root==null)
        {
            return;
        }
        
        int rootData=root.data;
    
        arr=arr+rootData+" ";
        if(k==rootData && root.left==null && root.right==null)
        {
            
            System.out.println(arr);
            return;
        }
        
        
        rootToLeafPathsSumToK(root.left,k-rootData,arr);
        rootToLeafPathsSumToK(root.right,k-rootData,arr);	//Your code goes here
	}


}
