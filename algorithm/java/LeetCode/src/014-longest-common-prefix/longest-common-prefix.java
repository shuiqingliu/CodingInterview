// Write a function to find the longest common prefix string amongst an array of strings.
//
// If there is no common prefix, return an empty string "".
//
// Example 1:
//
//
// Input: ["flower","flow","flight"]
// Output: "fl"
//
//
// Example 2:
//
//
// Input: ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
//
//
// Note:
//
// All given inputs are in lowercase letters a-z.
//


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (32.92%)
 * Total Accepted:    405.6K
 * Total Submissions: 1.2M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null){
            throw new IllegalArgumentException();
        }
        //store split result
        Queue<String> queue = new LinkedList<>();
        java.util.List<String[]> list = new ArrayList<>();
        // split the string
        for(int i = 0; i < strs.length; i++){
            list.add(strs[i].split(""));
        }
        // found the least split array size
        int minLength = 0;
        for (String[] stringList : list) {
            if(minLength == 0){
                minLength = stringList.length;
            }else{
                if(minLength > stringList.length){
                    minLength = stringList.length;
                }
            }
        }
        //according the least size and then add split result to queue
        for(int j =0; j < minLength; j++){
            for(int k = 0; k < list.size(); k++){
                queue.offer(list.get(k)[j]);
            }
        }
        // iterator the every array and add to set store
        Set<String> hash_set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        while(queue.peek() != null){
            for(int m = 0; m < list.size(); m++){
                hash_set.add(queue.poll());
            }
            if(hash_set.size() != 1){
                break;
            }
            stringBuilder.append(hash_set.iterator().next());
            hash_set.clear();
        }
        return stringBuilder.toString();
    }
}

