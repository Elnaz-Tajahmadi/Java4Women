
package testolive;

public class Olive {
    public String OliveName = "Kalamata";
    public long color = 0*000000;
    
    public Olive (){
        
    }
    public Olive (String OliveName, long color){
        this.OliveName = OliveName;
        this.color = color; 
    }
   public String toString(){
       return "Name:" + this.OliveName + "Color:" + this.color;
   }
}
