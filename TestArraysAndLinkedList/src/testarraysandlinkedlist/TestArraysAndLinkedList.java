
package testarraysandlinkedlist;

import java.util.Arrays;
import java.util.LinkedList;


public class TestArraysAndLinkedList {

    
    public static void main(String[] args) {
        //Converting Arrays to List
       String[]Stuff = {"Amanda", "Arvid", "Elen", "David", "Anita", "Marcus"};
        LinkedList <String> theList = new LinkedList <String> (Arrays.asList(Stuff)) ;
        
        theList.add("Alice");
        theList.addFirst("Johan");
        
        //Converting back to Arrays
        Stuff= theList.toArray(new String[theList.size()]);
            for(String x : Stuff){
                System.out.print(" "+ x +" ");
            }
            
    }
    
}
