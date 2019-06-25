package Homework31032019; //Java Program to demonstrate the use of static variable
public class Employee {
    int ID; //Create gloal or class variable
    String Name;
    static String Company = "BMW"; //static class variable as company name remain same for all emaployee
    Employee(int a, String b){ //Create constructor method with two local variable
        ID = a; //global variable = local variable
        Name = b; //global variable = local variable
    }
    void display (){
        System.out.println(ID+" "+Name+" "+Company);
    }

    public static void main(String[] args){ // Creat main method
    Employee E1 = new Employee(11,"Sandip"); // Class name Object = new Class name to creat obj
    Employee E2 = new Employee(21, "Ketan");
    E1.display(); //by mein method obj calling display method
    E2.display();
    }
}