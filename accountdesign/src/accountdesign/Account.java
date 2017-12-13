
package accountdesign;

import java.util.ArrayList;

public class Account {

   private String owner;
    private int balance;
    private int number;
    ArrayList <Transaction>transactions;

    private static int nAccounts = 0; // keep track of number of account

    public Account(String owner) {
        this.owner = owner;
        balance = 0;// compiler do this automatically also if we write anything
        nAccounts++;
        number = nAccounts;
        transactions =new ArrayList<>();
        transactions.add(new Creation());
    }

    public String getOwner() {
        return owner;
    }
    
    
    
    public void deposit(int amount) {
        balance += amount;
        transactions.add(new Deposit(amount));

    }

    public void withdrawl(int amount,Account other) {
        if (amount <= balance) {
            balance = balance - amount;
             transactions.add(new Withdrawal( amount));
             this.transactions.add(new TransferTo (amount,other));
             other.transactions.add(new TransferFrom (amount,this));

        } else {
            System.out.println("Not enough money");
        }

    }

    public void transferTo(int amount, Account other) {
        if (amount <= balance) {
            balance -= amount;
            other.balance = other.balance + amount;

        } else {
            System.out.println("Not enough money");
        }
    }
    public void printAll(){
        System.out.println(number +"/"+ owner+":"+ balance);
        System.out.println("Transactions");
        for (Transaction t : transactions) {
            t.print();
            
        }
         
    
    }

   
}

