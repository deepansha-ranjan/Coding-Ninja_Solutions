package CodingNinjas;

public class replace_with_sum_of_greater_nodes {
	

		public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
			if(root == null){
	            return;
	        }
	        int ans = replace(root ,0);
	        
			
		}
	    public static int replace(BinaryTreeNode<Integer> root ,int sum){
	        if(root == null){
	            return 0;
	        }
	        
	        int right = replace(root.right ,sum);
	        int rootdata = root.data;
	        root.data = root.data + right + sum;
	        int left = replace(root.left ,root.data);
	        
	        return rootdata + right + left;
			// Write your code here

		}
	
}
