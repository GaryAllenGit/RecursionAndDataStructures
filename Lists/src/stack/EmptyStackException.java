package stack;

class EmptyStackException extends Exception {
    EmptyStackException(){               // constructor which does nothing
    }

    EmptyStackException(String message){ // constructor with error message handling
        super(message);
    }
}
