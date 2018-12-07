package stack;

public class Stack {
    StackNode top;

    public Stack() {
        top = null;
    }

    public void addEntry(String entry) {
        StackNode temporary = top;
        top = new StackNode(entry);
        top.next = temporary;
    }


    public String getEntry() throws EmptyStackException {
        if (top == null)
            throw new EmptyStackException();
        else {
            String result = top.dataItem;
            top = top.next;
            return result;
        }
    }
}
