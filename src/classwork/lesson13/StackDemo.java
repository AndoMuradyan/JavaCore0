package classwork.lesson13;

import classwork.lesson11.stack.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(8);
        System.out.println(stack.pop());
    }
}
