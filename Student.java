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
    public String getName(String name){
        return name;
    }
    public int getId(int id){
        return id;
    }
    public double getBalance(double balance){
        return balance;
    }
    public void chargeLunch(int month, int day){
        balance -= 7; //hard-code for lunch amount
        Transaction t = new Transaction(month, day, -7);
        transactions.add(t);
    }
    public String toString(){
        return "Name: " + name + "ID: #" + id + "Balance: " + balance + "Transactions: " + transactions;
    }
}