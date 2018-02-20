
package testnumber;

import java.text.NumberFormat;


public class TestNumber {

    
    public static void main(String[] args) {
        int numberOfOlivers = 1_000_000_000;
        NumberFormat formatter = NumberFormat.getInstance();
        System.out.println(formatter.format(numberOfOlivers));
    }
    
}
