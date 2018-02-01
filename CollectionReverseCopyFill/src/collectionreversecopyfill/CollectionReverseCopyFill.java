
package collectionreversecopyfill;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionReverseCopyFill {

   
    public static void main(String[] args) {
        Character [] Elnaz = {'a','n','m','s','b'};
        List <Character> M = Arrays.asList(Elnaz);
        
        System.out.println("List is : "); 
        output(M);
        
        //Revers and print the list
        Collections.reverse(M);
        System.out.println("After reverse : ");
        output(M);
        
        //Create a new array and a new list
        Character [] newElnaz = new Character [5];
        List <Character> ListCopy = Arrays.asList(newElnaz);
        
        //Copy content of list into ListCopy
        Collections.copy(ListCopy, M);
        System.out.println("Copy of List : ");
        output(ListCopy);
        
        //Fill Colllections
        Collections.fill(M, 'x');
        System.out.println("Fill collections : ");
        output(M);
        
    }
    private static void output(List<Character> theList){
        for(Character thing : theList){
            System.out.print(" " + thing);
        }
        System.out.println(" ");
    }
    
}
