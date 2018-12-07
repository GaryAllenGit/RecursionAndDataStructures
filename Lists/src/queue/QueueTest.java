package queue;

public class QueueTest {
    public static void main(String args[]) {
        Queue q = new Queue();

        q.addEntry("This");
        q.addEntry("Is");
        q.addEntry("A");
        q.addEntry("Test");

        while (true) {
            try{
                System.out.println(q.getEntry());
            } catch (EmptyQueueException e) {
                break;
            }
        }
    }
}
