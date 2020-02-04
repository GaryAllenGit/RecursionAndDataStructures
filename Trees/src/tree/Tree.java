package tree;

class Tree {
    private TreeNode root;

    Tree(){
        root = null;
    }

    void add(String newWord){
        root = addNewNode(root, newWord);
    }

    private TreeNode addNewNode(TreeNode N, String newWord){
        if (N == null)
            return new TreeNode(newWord);
        else if (N.dataItem.compareTo(newWord) > 0){
            N.left = addNewNode(N.left, newWord);
            return N;
        } else {
            N.right = addNewNode(N.right, newWord);
            return N;
        }
    }

    void display(){
        displayTree(root);
    }

    private void displayTree(TreeNode N){
        if (N != null) {
            displayTree(N.left);
            System.out.println(N.dataItem);
            displayTree(N.right);
        }
    }
}
