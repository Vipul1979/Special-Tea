package Myhomework;
// we are creating user define method with arguments
public class Methodwitharguments4 { //Create a class
    public static void main(String[] args) { //create main method to write arguments
        addition(10, 20); //Assign the value in a main method by calling the user define method
        multiplication(30, 40);
        substration(300, 400);

    }
    public static void addition(int a, int b) { //create addition user define method and declare variable
        System.out.println(a + b); //print result
    }
    public static void multiplication(int c, int d) {
        System.out.println(c * d);
    }
    public static void substration(int e, int f) {
        System.out.println(e - f);
    }
}
