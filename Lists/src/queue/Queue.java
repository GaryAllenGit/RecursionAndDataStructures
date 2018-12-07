package queue;

public class Queue {

    QueueNode top;

    public Queue() {
        top = null;
    }

    public void addEntry(String entry) {
        top = addToList(top, entry);
    }

    private QueueNode addToList(QueueNode N, String entry){
        if (N == null)
            return new QueueNode(entry);
        else {
            N.next = addToList(N.next, entry);
            return N;
        }
    }

    public String getEntry() throws EmptyQueueException {
        if (top == null)
            throw new EmptyQueueException();
        else {
            String result = top.dataItem;
            top = top.next;
            return result;
        }
    }
}
