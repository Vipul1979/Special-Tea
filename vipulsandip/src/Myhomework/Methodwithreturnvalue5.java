package Myhomework;

public class Methodwithreturnvalue5 {
    public static void main (String[] args){
        int value=multiplication(1,2,3,4);//create new variable to store value
        int total=value*2;
        int amount=total-10;
        int totalamount=amount+50;
        System.out.println(value+total+amount+totalamount);
    }

    public static int multiplication(int a, int b, int c, int d){
        return(a*b*c*d);
    }
//in return value method we do not need to create method again and again
    //In this method we print value in main method
}


