import java.util.*;
public class S1P10 {
    public static void main(String[] args) {
        StackUsingDeque stack = new StackUsingDeque();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
class StackUsingDeque {
    Deque<Integer> deque = new ArrayDeque<>();
    void push(int x) {
        deque.addFirst(x);
    }
    int pop() {
        return deque.removeFirst();
    }
    int peek() {
        return deque.peekFirst();
    }
    boolean isEmpty() {
        return deque.isEmpty();
    }
}
