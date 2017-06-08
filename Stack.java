package javatest2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
	

    public static void main(String[] args) {
    	Deque<String> stack = new ArrayDeque<>(5);
        stack.push("Justin");
        stack.push("Monica");
        stack.push("Irene");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
