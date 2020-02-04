package stack;

class StackNode {
    String dataItem;
    StackNode next;

    StackNode(String entry){
        dataItem = entry;
        next = null;
    }
}
