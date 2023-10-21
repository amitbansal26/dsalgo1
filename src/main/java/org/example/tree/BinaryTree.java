package org.example.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BinaryTree {

    public static void main(String[] args) {
      BinaryTree binaryTree = new BinaryTree();
      create();
    }


    static TreeNode create(){
        TreeNode p,t;
        int x;
        Deque<TreeNode> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the root value::: ");
        x = scanner.nextInt();
        TreeNode root = new TreeNode(x, null, null);
        deque.offer(root);
        while (!deque.isEmpty()){
         p = deque.poll();
            System.out.print("Enter the Left child:::::");
            x = scanner.nextInt();
            if(x==1000){
                break;
            }
            if (x!=-1){
                 t = new TreeNode(x, null, null);
                 p.left = t;
                 deque.offer(t);
            }
            System.out.print("Enter the Right child:::::");
            x = scanner.nextInt();
            if(x==1000){
                break;
            }
            if (x!=-1){
                t = new TreeNode(x, null, null);
                p.right = t;
                deque.offer(t);
            }
        }
        return root;
    }
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root==null)
            return null;
        if (root.val==p.val)
            return p;
        if (root.val==q.val)
            return q;
        TreeNode leftAns = lowestCommonAncestor(root.left, p, q);
        TreeNode rightAns = lowestCommonAncestor(root.right, p , q);
        if (leftAns==null && rightAns==null)
            return null;
        else if (leftAns!=null && rightAns==null)
            return leftAns;
        if (leftAns==null && rightAns!=null)
            return rightAns;
        else
            return root;
    }
}
