package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int target = r.nextInt(100);
        int guess;
        
         do {

            guess = sc.nextInt();

            if (guess < target) {
                System.out.println(" The number you guesses is smaller than the correct number ");
            } else if (guess > target) {
                System.out.println(" The number you guess is bigger than the correct number");
            } else {
                System.out.println(" The number is correct ");
                break;
            }
            
         }while (guess != target);
       
    }

}
