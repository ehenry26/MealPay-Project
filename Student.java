import java.util.*;

public class Student<Transaction>{
    //fields
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;

    //constructor
    public Student(String myName, int myId, double myBalance){
        myName = name;
        myId = id;
        myBalance = balance;
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    }
    public void setID(){
		id = idGen;
		idGen++;
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
    //public double makeTransaction(int month, int day){
        //return balance - transactions.getAmount();
    }


    public String toString(){
        return "Name: " + name + "ID: #" + id + "Balance: " + balance + "Transactions: " + transactions;
    }
}