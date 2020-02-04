package tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree wordTree = new Tree();

        wordTree.add("This");
        wordTree.add("Is");
        wordTree.add("A");
        wordTree.add("Test");

        wordTree.display();
    }
}

