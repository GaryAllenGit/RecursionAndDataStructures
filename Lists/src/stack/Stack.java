package stack;

class Stack {
    private StackNode top;

    Stack() {
        top = null;
    }

    void addEntry(String entry) {
        StackNode temporary = top;
        top = new StackNode(entry);
        top.next = temporary;
    }


    String getEntry() throws EmptyStackException {
        if (top == null)
            throw new EmptyStackException("Empty Stack");
        else {
            String result = top.dataItem;
            top = top.next;
            return result;
        }
    }
}
