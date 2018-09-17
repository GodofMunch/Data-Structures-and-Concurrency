import java.util.NoSuchElementException;

public class DaveLinkedList<E> {
    private class Node {
        public E data;
        public Node next;
    }

    private Node first;

    public DaveLinkedList() {
        first = null;
    }

    public void addFirst(E data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        first = node;
    }

    public E getFirst() {
       if(first == null)
           throw new NoSuchElementException();
       else
           return first.data;
    }

    public E removeFirst(){

        if(first == null)
            throw new NoSuchElementException();

        E element = first.data;
        first = first.next;

        return element;
    }

    public boolean isEmpty() {
        if(first == null)
            return true;
        else
            return false;
    }
}
