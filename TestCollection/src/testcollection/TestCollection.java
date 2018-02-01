package testcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {

        String[] things = {"Shirt", "Table", "Canvas", "egg", "Jar", "Ice-cream", "Bag"};
        List<String> List1 = new ArrayList<String>();

        for (String x : things) {
            List1.add(x);
        }

        String[] moreThings = {"Table", "Canvas", "Jar", "Bag"};
        List<String> List2 = new ArrayList<String>();

        for (String y : moreThings) {
            List2.add(y);
        }
        for (int i = 0; i < List1.size(); i++) {
            System.out.print(" " + List1.get(i) + " ");

        }
        editList(List1, List2);
        System.out.println();

        //Print List1
        for (int i = 0; i < List1.size(); i++) {
            System.out.print(" " + List1.get(i) + " ");
        }

    }

    private static void editList(Collection<String> L1, Collection<String> L2) {
        Iterator<String> it = L1.iterator();

        while (it.hasNext()) {
            if (L2.contains(it.next())) {
                it.remove();
            }
        }
    }

}
