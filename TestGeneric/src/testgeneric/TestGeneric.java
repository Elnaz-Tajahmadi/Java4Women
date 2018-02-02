
package testgeneric;


public class TestGeneric {

    
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,5};
        Character [] b = {'E','L','N','A','Z'};
        
        printMe(a);
        printMe(b);
    }
    public static <T> void printMe(T[] x ){
        for (T c: x){
            System.out.print(" " + c + " ");
            
        }
    }
}