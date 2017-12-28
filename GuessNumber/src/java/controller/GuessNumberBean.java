
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;


@Named(value = "guessNumber")
@SessionScoped
public class GuessNumberBean implements Serializable {

   private final int RANDOMnUMBER;
   private int max=10;
   private int min=1;
   private String response;
   private int userguess;
    
    public GuessNumberBean() {
        Random random = new Random();
        RANDOMnUMBER = random.nextInt(max)+1;
    }
    
    public String getResponse(){
      if (userguess==RANDOMnUMBER){
          return " You guessed right! ";
      
    }else if (userguess<RANDOMnUMBER){
          return " Too Low ";
    }else{
        return " Too high ";
}
}
    public String getImage() {
       if (userguess == RANDOMnUMBER) {
           return "resources/img/good.gif";

       } else if (userguess < RANDOMnUMBER) {
           return "resources/img/bad.gif";

       } else {
           return "resources/img/bad.gif";
       }
   }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getUserguess() {
        return userguess;
    }

    public void setUserguess(int userguess) {
        this.userguess = userguess;
    }

    
}
