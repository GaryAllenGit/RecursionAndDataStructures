package queue;

public class QueueNode {
    public String dataItem;
    public QueueNode next;

    public QueueNode(String entry){
        dataItem = entry;
        next = null;
    }
}
