
package teststack;

import java.util.Stack;


public class TestStack {

    
    public static void main(String[] args) {
        
        Stack <String> stack = new Stack();
        
        stack.push("First");
        printStack(stack);
        stack.push("Second");
        printStack(stack);
        stack.push("Third");
        printStack(stack);
        
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        
        
    }

    private static void printStack(Stack<String> s) {
        
        if(s.isEmpty()){
            System.out.println(" Stack Is Empty ");
        }else{
            System.out.println(s);
        }
    }
    
}
