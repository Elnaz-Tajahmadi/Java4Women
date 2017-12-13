package accountdesign;

import java.util.Date;

public abstract class Transaction {

    private int id;
    private Date timeStamp;
    private int amount;

    private static int nTransactions = 0;

    public Transaction(int amount) {
        this.amount = amount;
        nTransactions++;
        id = nTransactions;
        timeStamp = new Date();
    }
    @Override
    public String toString(){
        return timeStamp + "[" + id + "]" + amount;
    }
    
 
    public abstract void print();
       
    
}
