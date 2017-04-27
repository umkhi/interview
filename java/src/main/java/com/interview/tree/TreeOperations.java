
package com.interview.tree;

/**
 *
 * 
 */
public class TreeOperations {
    public TreeNode root;
    
    public TreeNode add(Integer data){
        return root=add(data,root);

    }
    private TreeNode add(Integer data, TreeNode node){
        if(node == null ){
            node = new TreeNode(data);
        }else if(data > node.data){
            node.right=add(data, node.right);
        }else{
            node.left=add(data,node.left);
        }
        return node;
    }
    
    public static void main(String args[]){
        TreeOperations tree = new TreeOperations();
        tree.add(100);
        System.out.println(tree);
        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(5);
        System.out.println(tree);
        tree.add(150);
        tree.add(125);
        tree.add(250);
        tree.add(200);
        System.out.println(tree);
    }

}
