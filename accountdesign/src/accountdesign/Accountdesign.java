
package accountdesign;


public class Accountdesign {

   
    public static void main(String[] args) {
        Account a1= new Account ("ulf");
        Account a2= new Account ("Anna");
        
        a1.deposit(200);
        a1.withdrawl(170,a2);
        
        a2.deposit(300);
        a2.transferTo(100, a1);
        
        a1.printAll();
        a2.printAll();
    }
    
}

       
 
