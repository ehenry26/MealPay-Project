import java.util.*;

public class Student{
    //fields
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;

    //constructor


    //methods



    public String toString(){
        return "Name: " + name + "ID: #" + id + "Balance: " + balance + "Transactions: " + transactions;
    }
}