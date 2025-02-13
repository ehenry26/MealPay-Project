
public class Transactions{
    //fields
    private int month;
    private int day;
    private double amount;

    //constructor
    public Transactions(int myMonth, int myDay, double myAmount){
        myMonth = month;
        myDay = day;
        myAmount = amount;

    }
    //methods
    public int getMonth(int month){
        return month;
    }

    public int getDay(int day){
        return day;
    }
    public double getAmount(double amount){
        return amount;
    }
    
    public String toString(){
        return month + "/" + day + ": $" + amount;
    }

}