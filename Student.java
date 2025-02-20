import java.util.*;

public class Student{
    //fields
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;

    //constructor
    public Student(String myName){
        myName = name;
        id = idGen;
        idGen++;
        balance = 0;
        transactions = new ArrayList<Transaction>();

    }
    //methods
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getBalance(int balance){
        return balance;
    }
    public void chargeLunch(int month, int day){
        balance -= 7; //hard-code for lunch amount
        Transaction t = new Transaction(month, day, -7);
        transactions.add(t);
    }
    //return null if there are no transactions on that day
    public ArrayList<Transaction> getTransactionsByDate(int month,int day){
        ArrayList<Transaction> givenDay = new ArrayList<Transaction>();

        for(Transaction t : transactions){
            if(month == t.getMonth() && day == t.getDay()){
                givenDay.add(t);
            }
        }
        if(givenDay.size() == 0){
            return null;
        } else{
            return givenDay;
        }
    }

    public String toString(){
        return "Name: " + name + ",ID: #" + id + ",Balance: " + balance + ", and Transactions: " + transactions;
    }
}