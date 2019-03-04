// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
// An input string is valid if:
//
//
// 	Open brackets must be closed by the same type of brackets.
// 	Open brackets must be closed in the correct order.
//
//
// Note that an empty string is also considered valid.
//
// Example 1:
//
//
// Input: "()"
// Output: true
//
//
// Example 2:
//
//
// Input: "()[]{}"
// Output: true
//
//
// Example 3:
//
//
// Input: "(]"
// Output: false
//
//
// Example 4:
//
//
// Input: "([)]"
// Output: false
//
//
// Example 5:
//
//
// Input: "{[]}"
// Output: true
//
//


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (35.78%)
 * Total Accepted:    515.8K
 * Total Submissions: 1.4M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
        if(s == null){
            System.out.print("illegal argument");
        }
        if(s.equals("")){
            return true;
        }
        String[] splitString = s.split("");
        Stack<String> storeTheleftParenthese = new Stack<>();
        List<String> leftParentheses = Arrays.asList("(","{","[");

        Map<String,String> parenthesesMap = new HashMap<>();
        parenthesesMap.put("(", ")");
        parenthesesMap.put("{","}");
        parenthesesMap.put("[","]");

        for(int i = 0 ; i < splitString.length; i++){
            if(leftParentheses.contains(splitString[i])){
                storeTheleftParenthese.push(splitString[i]);
            }else{
                String tempLeft = "";
                if(!storeTheleftParenthese.empty()){
                    tempLeft = storeTheleftParenthese.pop();
                }else{
                    return false;
                }
                if(!splitString[i].equals(parenthesesMap.get(tempLeft))){
                    return false;
                }
            }
        }
        if(storeTheleftParenthese.empty()){
            return true;
        }else{
            return false;
        }
    }
}


