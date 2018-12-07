package stack;

public class EmptyStackException extends Exception {
    public EmptyStackException(){               // constructor which does nothing
    }

    public EmptyStackException(String message){ // constructor with error message handling
        super(message);
    }
}
