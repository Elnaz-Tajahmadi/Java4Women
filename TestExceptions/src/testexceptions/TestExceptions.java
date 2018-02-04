
package testexceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TestExceptions {

    public static void main(String[] args) {
        try{
        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String Line;
        
        while ((Line = br.readLine())!=null){
            System.out.println("Read :" +Line);
        }
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
    
}
