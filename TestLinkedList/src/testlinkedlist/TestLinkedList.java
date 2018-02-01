
package testlinkedlist;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
import java.util.LinkedList;
import java.util.List;


public class TestLinkedList {

   
    public static void main(String[] args) {
      String [] things = {"apple", "orange", "pineapple", "peach", "pear"};
      List<String> List1 = new LinkedList<>();
      
      for (String x : things)
          List1.add(x);
      
       String [] things2 = {"Celery", "Dill", "Spinach", "Broccoli ", "Cabbage"};
      List<String> List2 = new LinkedList<>();
      
      for (String y : things2)
          List1.add(y);
      
      List1.addAll(List2);
      List2 = null;
      
      printMe(List1);
      removeThings(List1,2,5);
      printMe(List1);
      reverseMe(List1);
    }
    private static void printMe(List<String> L){
        for(String b : L){
            System.out.print(" " + b);
            System.out.println();
        }
    
        private static void removeThings(List<String> L , int from, int to){
            L.subList(from, to).clear();
        }
        private static void reverseMe(List<String> L){
            ListIterator <String> m = (ListIterator <String>) L.listIterator(L.size());
            
            while (m.hasPrevious()){
                System.out.print(m.previous());
                
            }
                System.out.println();
            }
                
            }
        
            
        
    

