package DoublyLinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();

        dll.appendFirst(1);
        dll.print();

        dll.appendLast(3);
        dll.print();

        dll.appendAt(1, 2);
        dll.print();

        dll.appendFirst(0);
        dll.print();

        dll.appendLast(4);
        dll.print();

        Integer removed = dll.removeAt(3);
        System.out.println("Node removed: " + removed);
        dll.print();

        dll.clear();
        dll.print();
    }
}
