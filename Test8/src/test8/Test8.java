package test8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test8 {

    public static void main(String[] args) {
        String[] things = {"eggs", "laser", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        for (String X : things) {
            list1.add(X);
        }
        String[] morethings = {"laser", "hats"};
        List<String> list2 = new ArrayList<String>();

        for (String y : morethings) {
            list2.add(y);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        editList(list1, list2);
        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
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

}
    
}
