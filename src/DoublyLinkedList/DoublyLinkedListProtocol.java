package DoublyLinkedList;

public interface DoublyLinkedListProtocol<E> {
    public void appendFirst(E value);
    public void appendAt(int index, E value);
    public void appendLast(E value);

    public abstract E removeAt(int index);

    public abstract boolean isEmpty();
    public abstract void clear();
    public abstract void print();
}
