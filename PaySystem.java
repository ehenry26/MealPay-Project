import java.util.*;

public class PaySystem{
    //fields
    ArrayList<Student> students;

    //constructor
    public PaySystem(){
        students = new ArrayList<Student>();
    }
    //methods
    public void logMeal(int month, int day, int id){
    //loop through all students and find matching id
    }
    //display students
    public String allStudents(){
        String all = "";
        for(Student st : students){
            all += st.toString();
            all += "\n";
        }
        return all;
    }
    //display balance
    //display students negative
    //look up students
    
    //display transactions on given day
    public String transactionsByDay(int month, int day){
        String s = "";
        for(Student st : students){
            ArrayList<Transaction> tByDay = st.getTransactionsByDate(month,day);
            if(tByDay != null){
                s += tByDay.toString() + " by:" + st.getName() + " ID:" + st.getId();
                s += "\n";
            }
        }
        return s;
    }
    




}