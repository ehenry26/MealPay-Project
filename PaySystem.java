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
        for(Student st : students){
            if(id == st.getId()){
                st.chargeLunch(month, day);
            }
        }
        
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
    //add students
    public void addStudent(String name){
        Student s = new Student(name);
        students.add(s);
    }
    //add balance
    public void addBalance(int month, int day, int id, double val){
        
    }
    
    //display students with negativebalance
    public String allNegativeStudents(){
        String neg = "";
        for(Student st : students){
            if(st.getBalance() > 0){
                neg += st.toString();
                neg += "\n";
            }
        }
        return neg;
    }
    //look up students
    public String findStudent(int id){
        String found = "";
        for(Student st : students){
            if(id == st.getId()){
                found += st.toString();
                found += "\n";
            }else{
                return "ERROR: Student not found";
            }
        }
        return found;
    }
    
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