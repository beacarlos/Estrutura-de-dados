package DoublyLinkedList;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void appendFirst(E value) {
        Node<E> fresh = new Node<>(null, value, null);
        if (head == null) {
            this.head = fresh;
            this.tail = fresh;
        } else {
            this.head.setPrevious(fresh);
            fresh.setNext(this.head);
            this.head = fresh;
        }
        this.size++;
    }

    public void appendAt(int index, E value) {
        if (index == 0) {
            this.appendFirst(value);
            return;
        } else if (index == this.size) {
            this.appendLast(value);
            return;
        } else if (index < 0 || index > this.size) {
            System.out.println("Index out of bounds.");
            return;
        }

        Node<E> fresh = new Node<>(null, value, null);
        Node<E> anchor;
        if (index <= (this.size / 2)) {
            anchor = this.head;
            for(int i = 0; i < index; i++) {
                anchor = anchor.getNext();
            }
        } else {
            anchor = this.tail;
            for(int i = this.size; i > index; i--) {
                anchor = anchor.getPrevious();
            }
        }
        anchor = anchor.getPrevious();

        fresh.setNext(anchor.getNext());
        fresh.setPrevious(anchor);

        anchor.getNext().setPrevious(fresh);
        anchor.setNext(fresh);
        this.size++;
    }

    public void appendLast(E value) {
        if (this.tail == null) {
            this.appendFirst(value);
            return;
        }

        Node<E> fresh = new Node<E>(this.tail, value, null);
        this.tail.setNext(fresh);
        this.tail = fresh;
        this.size++;
    }

    public E removeAt(int index) {
        if (this.isEmpty()) {
            System.out.println("Empty List.");
            return null;
        } else if (index < 0 || index > this.size) {
            System.out.println("Index out of bounds.");
            return null;
        }

        Node<E> removed;
        if (index <= (this.size / 2)) {
            removed = this.head;
            for(int i = 0; i < index; i++) {
                removed = removed.getNext();
            }
        } else {
            removed = this.tail;
            for(int i = this.size; i > index; i--) {
                removed = removed.getPrevious();
            }
        }

        removed.getPrevious().setNext(removed.getNext());
        removed.getNext().setPrevious(removed.getPrevious());

        this.size--;
        return removed.getValue();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.println("Empty List.");
        } else {
            Node<E> current = this.head;
            System.out.print("[");
            for (int i = 0; i < this.size; i++) {
                System.out.print(current.getValue());
                if (current.getNext() != null) {
                    System.out.print(", ");
                    current = current.getNext();
                } else {
                    System.out.print("]\n");
                }
            }
        }
    }
}
