package GetOffer;

import java.util.Iterator;

/**
 * Created by qingliu on 2/28/18.
 */
public class Stack<Item> implements Iterable<Item> {

    private Node first; // top of the stack
    private int N; //numbers of item

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){ return first == null; }
    public int size(){ return N; }

    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current =  first;

        public boolean hasNext(){
            return current != null;
        }
        public void remove(){ }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
