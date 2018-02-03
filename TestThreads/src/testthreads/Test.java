
package testthreads;


public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread (new Eli("First Thread"));
        Thread t2 = new Thread (new Eli("Second Thread"));
        Thread t3 = new Thread (new Eli("Third Thread"));
        Thread t4 = new Thread (new Eli("Forth Thread"));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
