/**
 * Created by qingliu on 7/30/18.
 */

/**
 * Definition for ListNode
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class LintCode_211_Add_Two_Numbers_II {

    public static void main(String[] args){
        LintCode_211_Add_Two_Numbers_II solution = new LintCode_211_Add_Two_Numbers_II();
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(7);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(5);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        ListNode result =  solution.addLists2(listNode1,listNode4);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    /**
     * @param l1: The first list.
     * @param l2: The second list.
     * @return: the sum list of l1 and l2.
     */
    public ListNode addLists2(ListNode l1, ListNode l2) {
        ListNode resultList = null;
        ListNode currentPoint = null;
        // write your code her
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carryBit = 0;
        while (l1 != null && l2 != null){
            int sum = l1.val + l2.val + carryBit;
            carryBit = sum / 10;
            ListNode samePositionReuslt = new ListNode(sum % 10);
            if(resultList == null){
                currentPoint = samePositionReuslt;
                resultList = currentPoint;
            }else {
                currentPoint.next = samePositionReuslt;
                currentPoint = currentPoint.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + carryBit;
            carryBit = sum / 10;
            ListNode tempL1 = new ListNode(sum % 10);
            currentPoint.next = tempL1;
            currentPoint = currentPoint.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + carryBit;
            carryBit = sum / 10;
            ListNode tempL2 = new ListNode(sum % 10);
            currentPoint.next = tempL2;
            currentPoint = currentPoint.next;
            l2 = l2.next;
        }

        if (carryBit != 0){
            currentPoint.next = new ListNode(carryBit);
        }


        return reverse(resultList);

    }

    public static ListNode reverse(ListNode listNode){
        if (listNode == null){
            return null;
        }

        ListNode head = null;
        while (listNode != null){
            ListNode tempNode = listNode.next;
            listNode.next = head;
            head = listNode;
            listNode = tempNode;
        }
        return head;
    }
}

