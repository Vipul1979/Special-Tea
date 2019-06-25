package Homework31032019;
//Exercise - V:
//1. Demonstrate Final keyword usage for variables and methods
// Final keyword to stop value change, to stop method overriding, to stop inheritance
public class ExcerciseV {
    final int Speed = 70;
    void display(){
        System.out.println("Nations speed limit is:" +Speed );
    }
    public static void main (String[] args){
        ExcerciseV S1 = new ExcerciseV();
        S1.display();
    }
}
