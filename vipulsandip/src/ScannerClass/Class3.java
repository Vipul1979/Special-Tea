package ScannerClass;

import java.util.Scanner;

public class Class3 {
    public static void main (String[] args){
        Scanner Vipul = new Scanner(System.in);
        System.out.print("Please input your name---->");
        String name = Vipul.nextLine();
        System.out.print("Please input your age");
        int age = Vipul.nextInt();

        System.out.println("Your name is ::" + name);
        System.out.println("Your age is :: " + age);
    }
}
