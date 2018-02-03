package testthreads;

import java.util.Random;

    public class Eli implements Runnable {

        String name;
        int time;
        Random r = new Random();

        public Eli(String x) {
            name = x;
            time = r.nextInt(999);
        }

        public void run( String a, int b) {
            try {
                System.out.println("%s is sleeping for %d\n",a,b);
                Thread.sleep(time);
                System.out.println("% id done\n ",a);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

    }
