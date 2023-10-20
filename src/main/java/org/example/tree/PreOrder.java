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
            preorder(node.leftNode);
            preorder(node.rightNode);
        }
    }
    private static void inorder(TreeNode node) {

        if (node !=null){
            inorder(node.leftNode);
            System.out.print(" " + node.val + " ");
            preorder(node.rightNode);
        }
    }
    private static void postorder(TreeNode node) {

        if (node !=null){
            postorder(node.leftNode);
            postorder(node.rightNode);
            System.out.print(" " + node.val + " ");
        }
    }

}
