package queue;

public class EmptyQueueException extends Exception {
    public EmptyQueueException(){               // constructor which does nothing
    }

    public EmptyQueueException(String message){ // constructor with error message handling
        super(message);
    }
}
