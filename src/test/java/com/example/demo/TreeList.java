package com.example.demo;

/**
 * Created by ldh on 2018/6/19.
 */
public class TreeList {
    private TreeNode root;
    public void preOrder(TreeNode node){
        if (node == null){
            return;
        }
        visit(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    private void visit(TreeNode node) {
        System.out.println(node.val);
    }

}
