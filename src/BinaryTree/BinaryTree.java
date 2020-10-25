package BinaryTree;

public class BinaryTree implements BinaryTreeProtocol {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() { return root; }

    public void setRoot(Node root) { this.root = root; }

    public void insert(Integer value) {
        Node node = new Node(value);
        if (this.isEmpty()) {
            this.setRoot(node);
            return;
        }

        Node tmp = this.root;
        while (tmp != null) {

            if (node.isEquals(tmp)) {
                System.out.println("The node value is already in the tree.\n");
                return;
            }

            if (node.getValue() > tmp.getValue()) {
                if (tmp.getRightChild() == null) {
                    node.setParent(tmp);
                    return;
                } else {
                    tmp = tmp.getRightChild();
                }
            } else {
                if (tmp.getLeftChild() == null) {
                    node.setParent(tmp);
                    return;
                } else {
                    tmp = tmp.getLeftChild();
                }
            }
        }
    }

    public Node fetch(Integer value) {
        Node tmp = this.root;
        while (tmp != null) {
            if (tmp.getValue().equals(value)) {
                return tmp;
            }

            if (tmp.getValue() < value) {
                tmp = tmp.getRightChild();
            } else {
                tmp = tmp.getLeftChild();
            }
        }
        return null;
    }

    public Node remove(Integer value) {
        Node removed = this.fetch(value);

        if (removed.isLeaf()) {
            removed.unlink();
            return removed;
        }

        Node tmp = removed;
        if (tmp.getRightChild() != null) {
            tmp = tmp.getRightChild();
            while (tmp.getLeftChild() != null) {
                tmp = tmp.getLeftChild();
            }
        } else if (tmp.getLeftChild() != null) {
            tmp = tmp.getLeftChild();
            while (tmp.getRightChild() != null) {
                tmp = tmp.getRightChild();
            }
        }

        while (!removed.isLeaf()) {
            if (removed.getLeftChild() != null) {
                removed.swapValues(removed.getLeftChild());
                removed = removed.getLeftChild();
            } else if (removed.getRightChild() != null) {
                removed.swapValues(removed.getRightChild());
                removed = removed.getRightChild();
            }
        }

        removed.unlink();
        return removed;
    }

    public void printInorder(Node node) {
        if (this.isEmpty()) {
            System.out.println("Nothing to show here.\n");
            return;
        }

        if (node != null) {
            this.printInorder(node.getLeftChild());
            System.out.print(node.getValue() + "\t");
            this.printInorder(node.getRightChild());
        }
    }

    public void printPreorder(Node node) {
        if (this.isEmpty()) {
            System.out.println("Nothing to show here.\n");
            return;
        }

        if (node != null) {
            System.out.print(node.getValue() + "\t");
            this.printPreorder(node.getLeftChild());
            this.printPreorder(node.getRightChild());
        }
    }

    public void printPostorder(Node node) {
        if (this.isEmpty()) {
            System.out.println("Nothing to show here.\n");
            return;
        }

        if (node != null) {
            this.printPostorder(node.getLeftChild());
            this.printPostorder(node.getRightChild());
            System.out.print(node.getValue() + "\t");
        }
    }

    public boolean isEmpty() { return this.root == null; }

    public void clear() {
        this.root = null;
        System.out.println("The tree was cleaned.\n");
    }
}
