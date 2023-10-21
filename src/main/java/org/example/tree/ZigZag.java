package org.example.tree;

import java.util.*;

public class ZigZag {
    public static void main(String[] args) {
        ZigZag zi = new ZigZag();
        System.out.println(zi.zigzagLevelOrder(BinaryTree.create()));
    }
   List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int len = q.size();
            for(int i=0;i<len;i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            if(!level.isEmpty()){
                if((result.size()+1)%2==0){
                    Collections.reverse(level);
                }
                result.add(level);
            }

        }
        return result;
    }
}
