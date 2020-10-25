package BinaryTree;

public interface BinaryTreeProtocol {
    public abstract void insert(Integer value);

    public abstract Node remove(Integer value);

    public abstract void printInorder(Node node);
    public abstract void printPreorder(Node node);
    public abstract void printPostorder(Node node);

    public abstract boolean isEmpty();
    public abstract void clear();
}
