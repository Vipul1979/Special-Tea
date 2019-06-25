package Homework31032019;
//2. Write a program to compare 3 numbers and print the greatest value
public class ExerciseI2 {
    public static void main (String[] args){
        int a=10;
        int b=20;
        int c=30;
        if(a>b && b>c){ //false condition, false condition the go to next condition
        System.out.println("a is greater then b");}
        else if (b>c){ //false condition
            System.out.println("b is greater then c ");}
        else if (a>c){ //false condition
            System.out.println("c is greater then b");}
        else { //false condition
            System.out.println ("c is greatest");
        }
    }
}

