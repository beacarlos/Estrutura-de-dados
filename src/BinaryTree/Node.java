package BinaryTree;

public class Node {
    private Integer value;
    private Node parent = null;
    private Node leftChild = null;
    private Node rightChild = null;

    public Node(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        if (parent == null) {
            if (this.parent.leftChild == this) {
                this.parent.setLeftChild(null);
            } else {
                this.parent.setRightChild(null);
            }
            this.parent = null;
            return;
        }

        if (parent.isEmpty()) {
            System.out.println("Exiting function because the parent node has no value.\n");
            return;
        }

        if (this.isEmpty()) {
            System.out.println("Exiting function because the node has no value.\n");
            return;
        }

        if (this.isEquals(parent)) {
            System.out.println("Parent node was not set because the node value is equals to the parent value.\n");
        } else if (this.getValue() > parent.getValue() && parent.getRightChild() == null) {
            this.parent = parent;
            parent.setRightChild(this);
        } else if (this.getValue() < parent.getValue() && parent.getLeftChild() == null) {
            this.parent = parent;
            parent.setLeftChild(this);
        } else {
            System.out.println("Parent node was not set because the parent node already has both child nodes populated.\n");
        }
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node node) {
        if (this.getLeftChild() == null) {
            if(this.value > node.getValue()) {
                this.leftChild = node;
            } else {
                System.out.println("Left-child not set because the node value is bigger than the parent.\n");
            }
        } else {
            System.out.println("Left-child not set because node already has left-child populated.\n");
        }
    }

    public Node getRightChild() { return rightChild; }

    public void setRightChild(Node node) {
        if (this.getRightChild() == null) {
            if(this.value < node.getValue()) {
                this.rightChild = node;
            } else {
                System.out.println("Right-child not set because the node value is smaller than the parent.\n");
            }
        } else {
            System.out.println("Right-child not set because node already has right-child populated.\n");
        }
    }

    public void clearRightchild() {
        this.rightChild = null;
    }

    public boolean isEquals(Node node) { return this.getValue().equals(node.getValue()); }

    public boolean isEmpty() { return this.getValue() == null; }

    public boolean isRoot() { return this.getParent() == null; }

    public boolean isLeaf() { return this.getLeftChild() == null && this.getRightChild() == null; }

    public int getDepth() { return this.isRoot() ? 0 : this.getParent().getDepth() + 1; }

    public int getHeight() {
        if (this.isLeaf()) {
            return 0;
        }

        if (this.getLeftChild() == null) {
            return this.getRightChild().getHeight() + 1;
        } else if (this.getRightChild() == null) {
            return this.getLeftChild().getHeight() + 1;
        } else {
            return Math.max(this.getLeftChild().getHeight(), this.getRightChild().getHeight()) + 1;
        }
    }

    public Node fetch(Integer value) {
        Node tmp = this;
        while (tmp != null) {
            if (tmp.getValue().equals(value)) {
                return tmp;
            }

            if (tmp.getValue() < value && tmp.getRightChild() != null) {
                tmp = tmp.getRightChild();
            } else if (tmp.getLeftChild() != null) {
                tmp = tmp.getLeftChild();
            } else {
                return null;
            }
        }
        return null;
    }

    public void swapValues(Node node) {
        Integer tmp_value = this.value;
        this.value = node.value;
        node.value = tmp_value;
    }

    public void unlink() {
        if (!this.isRoot()) {
            if (this == this.parent.leftChild) {
                this.parent.leftChild = null;
            } else {
                this.parent.rightChild = null;
            }
        }

        this.parent = null;
        this.rightChild = null;
        this.leftChild = null;
    }
}
