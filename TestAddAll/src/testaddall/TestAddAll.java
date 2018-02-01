
package testaddall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestAddAll {

   
    public static void main(String[] args) {
     
        String [] Elnaz = {"Helena", "Ellin", "Amanda", "Sara", "Mona", "Nika"};
        List <String> List1 = Arrays.asList(Elnaz);
        
        ArrayList <String> List2 = new ArrayList<String>();
        
        List2.add("Maria");
        List2.add("Juliana");
        List2.add("Simona");
        List2.add("Eva");
        
        Collections.addAll(List2, Elnaz);
        System.out.println();
        
        for (String x : List2){
            System.out.println(" "+ x);
    }
    }
    
}
