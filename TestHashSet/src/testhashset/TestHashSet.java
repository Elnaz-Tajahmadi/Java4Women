
package testhashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TestHashSet {

    
    public static void main(String[] args) {
       String [] Color = {"Blue","Red","Blue","Green","Blue","Gold","Black","Blue","Orange","Yellow","Blue","Silver","Blue","Violet","Blue","Pink","Blue"};
       List<String> L = Arrays.asList(Color);
       
        System.out.println(L);
        System.out.println();
        
        Set<String> s = new HashSet<String>(L);
        System.out.println(s);
        System.out.println();
    }
    
}