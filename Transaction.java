
public class Transaction{
    //fields
    private int month;
    private int day;
    private double amount;

    //constructor
    public Transaction(int myMonth, int myDay, double myAmount){
        month = myMonth;
        day = myDay;
        amount = myAmount;

    }
    //methods
    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }
    public double getAmount(){
        return amount;
    }
    
    public String toString(){
        return month + "/" + day + ": $" + amount;
    }

}