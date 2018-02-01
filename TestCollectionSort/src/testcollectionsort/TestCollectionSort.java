
package testcollectionsort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class TestCollectionSort {

    
    public static void main(String[] args) {
       String [] List1 = {"Maria", "Amanda", "Ellen", "Helena", "Tina", "Lia"};
       List <String> L = Arrays.asList(List1);
       
        Collections.sort(L);
        System.out.println(L);
        
        Collections.sort(L, Collections.reverseOrder());
        System.out.println(" "+ L);
    }
    
}
