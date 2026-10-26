public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertNode(current.left, value);
        } else if (value > current.value) {
            current.right = insertNode(current.right, value);
        }

        return current;
    }

    public int countLeaves() {
        return countLeavesNode(root);
    }

    private int countLeavesNode(Node current) {
        if (current == null) {
            return 0;
        }

        if (current.left == null && current.right == null) {
            return 1;
        }

        return countLeavesNode(current.left)
                + countLeavesNode(current.right);
    }
}