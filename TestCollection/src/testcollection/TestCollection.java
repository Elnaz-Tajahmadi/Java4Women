
package testcollection;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {
       
        String [] things = {"Shirt", "Table", "Canvas", "egg", "Jar", "Ice-cream", "Bag"};
        List <String> List1 = new ArrayList <String>();
        
        for (String x : things) {
            List1.add(x);
        }
        
        String [] moreThings = { "Table", "Canvas", "Jar", "Bag"};
        List <String> List2 = new ArrayList <String>();
        
         for (String y : moreThings) {
            List2.add(y);
    }
         for (int i = 0; i < List2.size(); i++) {
             System.out.println(List2.get(i));
            
        }
    }   
    
}
