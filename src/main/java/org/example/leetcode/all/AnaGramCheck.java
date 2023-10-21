package org.example.leetcode.all;

import java.util.HashMap;
import java.util.Map;

public class AnaGramCheck {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solve(s, t, new HashMap<Character, Integer>(),
                new HashMap<Character, Integer>()));

    }

    static boolean solve(String s, String t, Map<Character, Integer> sCountMap,
                         Map<Character, Integer> tCountMap) {

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            sCountMap.put(s.charAt(i), 1 + sCountMap.getOrDefault(s.charAt(i), 0));
            tCountMap.put(t.charAt(i), 1 + tCountMap.getOrDefault(t.charAt(i), 0));
        }
        return sCountMap.equals(tCountMap);
    }
}
