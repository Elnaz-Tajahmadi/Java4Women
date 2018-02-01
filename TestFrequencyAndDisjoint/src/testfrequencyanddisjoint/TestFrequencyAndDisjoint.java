
package testfrequencyanddisjoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestFrequencyAndDisjoint {

    public static void main(String[] args) {
        String [] Elnaz = {"Helena", "Ellin", "Amanda", "Sara", "Mona", "Nika"};
        List <String> List1 = Arrays.asList(Elnaz);
        
        ArrayList <String> List2 = new ArrayList<String>();
        
        List2.add("Maria");
        List2.add("Juliana");
        List2.add("Simona");
        List2.add("Eva");
        List2.add("Shila");
        
        Collections.addAll(List2, Elnaz);
        System.out.println();
        
        for (String x : List2){
            System.out.println(" "+ x);
        }
        System.out.println(Collections.frequency(List2, "Maria"));
        
        boolean tof = Collections.disjoint(List1, List2);
        System.out.println(tof);
        
        if(tof){
            System.out.println("Good");
        }else {
            System.out.println("Bad");
        }
    }
}
    

