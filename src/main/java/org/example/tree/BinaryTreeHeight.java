package org.example.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTreeHeight {

    public static void main(String[] args) {

    }

    int heightofTree(final TreeNode root){
        if (root==null)
            return 0;
        int lh = heightofTree(root.left);
        int rh = heightofTree(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }




}
