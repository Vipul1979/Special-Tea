package Homework31032019;//Java static method
//If you apply static keyword with any method, it is known as static method.
//A static method belongs to the class rather than the object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it.
public class Student {
    int rollno; //Create class or global or instance variable
    String name;//Create class instance variable
    static String college = "London Ltd"; //Create and declare static class or static global variable
    //static method to change the value of static variable
    static void change (){
        college="UK Ltd"; }
    //constructor to initialize the variable
    Student (int r, String n){
    rollno=r; //local variable=global variable
    name=n; }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
    public static void main (String[] args){
    Student.change(); // calling change method, here we can call above static method without creating object if we didnt
        //write static word in above method then we have to creat object here.
    Student S1 = new Student(21,"Rahul");// Create object and declare value
    Student S2 = new Student(31,"Hitesh");//Create object and declare value
    Student S3 = new Student(51,"Kamlesh");//Create object and declare value
    S1.display();
    S2.display();
    S3.display();
    }
}
