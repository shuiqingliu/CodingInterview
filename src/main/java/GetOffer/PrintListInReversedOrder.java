package GetOffer;

/**
 * Created by qingliu on 2/28/18.
 */

// 面试题6：从尾到头打印链表
// 题目：输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
    
public class PrintListInReversedOrder {

    public static void main(String args[]){
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();

        one.item = 1;
        one.next = two;
        two.item = 2;
        two.next = three;
        three.item = 3;
        three.next = four;
        four.item = 4;

        printReverseList(one);
    }

    private static class Node{
        int item;
        Node next;
    }

    public static void printReverseList(Node listNode){
        Stack<Integer> nodes = new Stack<>();

        Node node = listNode;
        while (node != null){
            nodes.push(node.item);
            node = node.next;
        }

        while (!nodes.isEmpty()){
            int outputNode = nodes.pop();
            System.out.println(outputNode);
        }
    }

}
