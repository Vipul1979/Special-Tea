package Homework240319;

public class Clac2 {
    public static void main(String[] args){
        substraction(5,10,25);
        substraction(5,10,35);
        substraction(5,10,45);
        substraction(5,10,55);
    }

    public static void substraction(int a, int b, int c){
        int d = (c-b-a);
        System.out.println(d);

    }
}
