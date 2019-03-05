/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (45.59%)
 * Total Accepted:    514.4K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        //截取到都不为空 剩下的直接拼接
        while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    currentNode.next = l1;
                    l1 = l1.next;
                }else if(l1.val > l2.val){
                    currentNode.next = l2;
                    l2 = l2.next;
                }
                currentNode = currentNode.next;
        }
        //直接拼接
        if(l2 != null){
            currentNode.next = l2;
        }else{
            currentNode.next = l1;
        }

        return result.next;
    }
}

