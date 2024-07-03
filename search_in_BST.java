package CodingNinjas;

public class search_in_BST {
	
		public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
			if(root==null)
	            return false;
	          boolean ans;
	        if(root.data==k)
	            return true;
	        
	            else if(k>root.data)
	                ans=searchInBST(root.right,k);
	        else
	            ans=searchInBST(root.left,k);
	        return ans;

		}
	}

