
package TestQueue;

import java.util.PriorityQueue;


public class TestQueue {

    
    public static void main(String[] args) {
       PriorityQueue <String> q = new PriorityQueue<>();
       
       q.offer("First");
       q.offer("Second");
       q.offer("Third");
        System.out.println(q);
        System.out.println(" " + q.peek());
        
        //Remove the head of the queue
        q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
    
}
