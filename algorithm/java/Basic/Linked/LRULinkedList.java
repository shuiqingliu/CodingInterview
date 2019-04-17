import java.util.LinkedList;
import java.util.Scanner;

/**
 * 实现基于单链表的 LRU 算法
 * Created by afu on 2019-04-17.
 */
public class LRULinkedList<T> {

    //default
    private static final Integer DEFAULT_LENGTH = 10;
    //头节点
    private Node<T> head;
    //LRU 容量
    private Integer capacity;
    //当前存储容量
    private Integer length;


    public LRULinkedList(){
        this.head = new Node<>();
        this.capacity = DEFAULT_LENGTH;
        this.length = 0;
    }

    public LRULinkedList(Integer capacity){
        this.head = new Node<>();
        this.capacity = capacity;
        this.length = 0;
    }

    public void add(T data){
        Node preNode = findPre(data);
        if (preNode != null){
            //删除匹配到的节点
            deleteNode(preNode);
            //插入到链表头部
            insertAtHead(data);
        }else {
            if (length >= this.capacity){
                deleteLinkedListEnd(head);
            }
            insertAtHead(data);
        }
    }

    //找到匹配节点的前一个节点
    private Node findPre(T data){
        Node node = head;
        while (node.getNext() != null){
            if (data.equals(node.getNext().getValue())){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //插入链表头部
    private void insertAtHead(T data){
        Node node = new Node(data,head.getNext());
        head.setNext(node);
        length++;
    }

    //删除指定位置元素
    private void deleteNode(Node preNode){
        Node node = preNode.getNext();
        preNode.setNext(node.getNext());
        length--;
    }

    //删除链表的最后一个节点
    public boolean deleteLinkedListEnd(Node head){
        Node node = head;
        if (node.getNext() != null){
            return false;
        }

        while(node.getNext().getNext() != null){
            node = node.next;
        }
        node.setNext(null);
        length--;
        return true;
    }
    //输出当前节点
    private void printAll(){
        Node node = head.getNext();
        while (node != null){
            System.out.print(node.getValue() + ",");
            node = node.next;
        }
        System.out.println();
    }



    //定义链表节点
    public class Node<T>{
        private T value;
        private Node next;

        public Node(T value){
            this.value = value;
        }

        public Node(T value,Node next){
            this.value = value;
            this.next = next;
        }

        public Node(){
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args){
        LRULinkedList  list = new LRULinkedList(5);
        Scanner sc = new Scanner(System.in);
        while (true){
            list.add(sc.nextInt());
            list.printAll();
        }
    }
}
