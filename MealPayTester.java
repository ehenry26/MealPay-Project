public class MealPayTester {
    public static void main(String[] args) {
    PaySystem p = new PaySystem();

    System.out.println("Adding some students...");
    p.addStudent("Lennon Standridge");
    p.addStudent("Ginny Cheung");
    p.addStudent("Lilie Henry");
    
    System.out.println(p.allStudents());

    System.out.println("Making charges..");
    p.logMeal(2, 19, 1);
    p.logMeal(2, 19, 2);

    p.logMeal(2, 20, 1);
    p.logMeal(2, 20, 2);

    System.out.println(p.allStudents());

    System.out.println("Only negative balances...");
    System.out.println(p.allNegativeStudents());

    System.out.println("All transactions by day...");
    System.out.println(p.transactionsByDay(2,19));



    
}

}
