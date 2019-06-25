package Myhomework;

public abstract class Methodwithargumetns3 {
    public static void main(String[] args){
        multiple(20,30);
        multiple(40,50);
        multiple(60,70);
        multiple(80,90);
        multiple(100,110);
    }
    public static void multiple(int a, int b){
    int c = (a*b);
    System.out.println("multiple of"+a+" and "+b+ " = " +c);
    }
}