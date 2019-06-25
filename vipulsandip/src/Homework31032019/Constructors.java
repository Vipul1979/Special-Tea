package Homework31032019;
//Exercise-VII:
//1. Create a class with default and parameterised constructor methods
//to demonstrate constructor methods
public class Constructors {
    int ID;
    String Name;
    public Constructors(){
        System.out.println("Default Constructors");}
    public Constructors(int ID, String Name){
        this.Name=Name;
        this.ID=ID;
        }
    public static void main (String[] args){
        Constructors A1 = new Constructors();
        Constructors B1 = new Constructors(12,"Hello");
        System.out.println(B1.ID);
        System.out.println(B1.Name);
    }
}


