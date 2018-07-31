/**
 * Created by qingliu on 7/31/18.
 *
 * Definition ListNode:
 * class ListNode{
 *     int val;
 *     ListNode next;
 *     ListNode(int x){
 *         val = x;
 *         next = null;
 *     }
 * }
 * description：实现链表反转
 */


public class ReverseLinked {


    public static void main(String[] args){
        ListNode testNode = new ListNode(1);
        testNode.next = new ListNode(2);
        testNode.next.next = new ListNode(3);
        ListNode result = reverseWithHeadInsert(testNode);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverse(ListNode head){
        //循环处理相邻两个节点来完成反转
        if (head == null){
            return null;
        }
        ListNode pre = head;
        ListNode q = head.next;
        head.next = null;
        while (q != null){
            ListNode r = q.next;
            q.next = pre;
            pre = q;
            q = r;
        }
        return pre;
    }

    public static ListNode reverseWithHeadInsert(ListNode head){
        //头插法进行链表反转
        ListNode tempHead = null;
        while (head != null){
            ListNode next = head.next;
            head.next = tempHead;
            tempHead = head;
            head = next;
        }
        return tempHead;
    }

}
