package stack;

public class StackNode {
    public String dataItem;
    public StackNode next;

    public StackNode(String entry){
        dataItem = entry;
        next = null;
    }
}
