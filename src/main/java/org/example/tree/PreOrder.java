package org.example.tree;

public class PreOrder {

    public static void main(String[] args) {
    TreeNode root = BinaryTree.create();
    preorder(root);
    System.out.println("");
    inorder(root);
    System.out.println("");
    postorder(root);
    }

    private static void preorder(TreeNode node) {

        if (node !=null){
            System.out.print(" " + node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    private static void inorder(TreeNode node) {

        if (node !=null){
            inorder(node.left);
            System.out.print(" " + node.val + " ");
            preorder(node.right);
        }
    }
    private static void postorder(TreeNode node) {

        if (node !=null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(" " + node.val + " ");
        }
    }

}
