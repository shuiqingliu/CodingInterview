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
        ListNode result = reverseWithRecursion(testNode);
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

    public static ListNode reverseWithCircle(ListNode head){
        //从第二个元素开始反转将元素依次插入到 head 之后，最后将 head 移到末尾
        ListNode p = head.next;
        ListNode q = null;
        while (p.next != null){
            q = p.next;
            p.next = q.next;
            q.next = head.next;
            head.next = q;
        }

        p.next = head;
        head = p.next.next;
        p.next.next = null;
        return head;

    }

    public static ListNode reverseWithRecursion(ListNode head){
        //递归实现反转
        if (head == null || head.next == null){
            return head;
        }else {
            ListNode newNode = reverseWithRecursion(head.next);
            head.next.next = head;
            head.next = null;
            return newNode;
        }
    }
}
