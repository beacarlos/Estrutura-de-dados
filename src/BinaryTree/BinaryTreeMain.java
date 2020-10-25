package BinaryTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(50);
        bt.insert(17);
        bt.insert(72);
        bt.insert(12);
        bt.insert(23);
        bt.insert(54);
        bt.insert(76);
        bt.insert(9);
        bt.insert(14);
        bt.insert(19);
        bt.insert(67);

        System.out.println("Printing Preorder");
        bt.printPreorder(bt.getRoot());
        System.out.println("\n");

        System.out.println("Printing Inorder");
        bt.printInorder(bt.getRoot());
        System.out.println("\n");

        System.out.println("Printing Postorder");
        bt.printPostorder(bt.getRoot());
        System.out.println("\n");

        int num = 12;
        if (bt.fetch(num) != null) {
            System.out.println(num + " is in the tree.\n");
        } else {
            System.out.println(num + " is not in the tree.\n");
        }

        Node root = bt.getRoot();
        System.out.println("Depth: " + root.getDepth());
        System.out.println("Height: " + root.getHeight());

        Node removed = bt.remove(54);
        if (bt.fetch(removed.getValue()) == null) {
            System.out.println("The node with value " + removed.getValue() + " was removed.\n");
        } else {
            System.out.println("Something went wrong.\n");
        }

        System.out.println("Printing Inorder");
        bt.printInorder(bt.getRoot());
        System.out.println("\n");
    }
}
