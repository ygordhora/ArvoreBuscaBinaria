public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(1);
        tree.insert(13);
        tree.insert(4);
        tree.insert(6);
        tree.insert(74);
        tree.insert(10);


        System.out.println("Quantidade de folhas: "
                + tree.countLeaves());
    }
}