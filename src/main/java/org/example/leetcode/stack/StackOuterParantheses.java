package org.example.leetcode.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StackOuterParantheses {
    public static void main(String[] args) {
        StackOuterParantheses stackOut= new StackOuterParantheses();
       // System.out.println(stackOut.removeOuterParentheses("(()())(())"));
        System.out.println(stackOut.removeOuterParentheses("(()())(())(()(()))"));

    }

    public String removeOuterParentheses(String s) {
       StringBuilder result  = new StringBuilder();
        final Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() && c=='('){
                stack.push(c);
            }else if (stack.size()==1 && c==')'){
                stack.pop();
            }else  if (c=='('){
                stack.push(c);
                result.append(c);
            }else {
                stack.pop();
                result.append(c);
            }
        }
        return result.toString();
    }

    public int maxDepth(String s) {
        StringBuilder result  = new StringBuilder();
        final Deque<Character> stack = new ArrayDeque<>(s.length());
        int depth = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == '('){
                stack.push(s.charAt(i));
                depth = Math.max(depth, stack.size());
            }
            if (s.charAt(i) == ')'){
                stack.pop();
            }
        }
        return depth;
    }
}
