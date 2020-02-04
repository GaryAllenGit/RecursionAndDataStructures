package queue;

class Queue {

    private QueueNode top;

    Queue() {
        top = null;
    }

    void addEntry(String entry) {
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

    String getEntry() throws EmptyQueueException {
        if (top == null)
            throw new EmptyQueueException("Empty Queue");
        else {
            String result = top.dataItem;
            top = top.next;
            return result;
        }
    }
}
