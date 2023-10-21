package org.example.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DiagonalTraversal {

    public static void main(String[] args) {

    }

    List<Integer> diagonal(TreeNode root){
        final  List<Integer> ans = new ArrayList<>();
        final Deque<TreeNode> queue = new ArrayDeque<>();
        if (root==null)
            return ans;
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
           while(temp!=null){
               ans.add(temp.val);
               if (temp.left!=null){
                   queue.push(temp.left);
               }
               temp = temp.right;
           }

        }
        return ans;
    }
}
