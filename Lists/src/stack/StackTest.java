package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class StackTest {

    public static void main(String args[]) {
        Stack s = new Stack();

        s.addEntry("This");
        s.addEntry("Is");
        s.addEntry("A");
        s.addEntry("Test");

        while (true) {
            try{
                System.out.println(s.getEntry());
            } catch (EmptyStackException e) {
                break;
            }
        }
    }
}
