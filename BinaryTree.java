package leecode;

import java.util.HashSet;
import java.util.Set;

import org.omg.PortableServer.ServantActivatorHelper;


public class BinaryTree {

	
	
     public boolean findTarget(TreeNode root, int k) {
     
	     HashSet<Integer> set = new HashSet<Integer>();
	     return search(root, set, k);
    }

    public boolean search(TreeNode root,HashSet<Integer> set,int k){
    	if(root == null) return false;
    	if(set.contains(k-root.val)) return true;
    	set.add(root.val);
    	return search(root.left, set, k)||search(root.right, set, k);
    }
	
    
    class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

}


