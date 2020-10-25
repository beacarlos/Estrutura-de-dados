package DoublyLinkedList;

public class Node<E> {
    private E value;
    private Node<E> next;
    private Node<E> previous;

    public Node(Node<E> previous, E value, Node<E> next) {
        this.previous = previous;
        this.value = value;
        this.next = next;
    }

    public Node<E> getPrevious() {
        return this.previous;
    }
    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public E getValue() {
        return this.value;
    }
    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
