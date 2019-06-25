package ScannerClass;

import java.util.Scanner;

public class Class1 {
    public static void main (String[] args){
        Scanner Vipul = new Scanner(System.in);
        System.out.print("Please input your age--->");
        /*int num = Vipul.nextInt();  result is Please input your age--->5 ,
        now instead of int please enter double 5.5 number and see the result*/
        //System.out.println("Age you entered is : :" +num);   Age you entered is : :5
        double num = Vipul.nextDouble(); //next method is already available in scanner and its object refere to double's variable
        System.out.println("Age you entered is : :" +num);
    }/*Ans: Please input your age--->5
    Age you entered is : :5.0*/
}
