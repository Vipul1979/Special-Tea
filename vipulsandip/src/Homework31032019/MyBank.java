package Homework31032019;

public class MyBank extends Bank{
    public void openAccount (){
        System.out.println("You can open account with bank");
    }
    public void depositeMoney(){
        System.out.println("you can deposite money");
    }
    public void transferMoney(){
        System.out.println("you transfer money to any account");
    }
    public static void main (String[] args){
        MyBank MB1 = new MyBank(); /* new is child class object store in parents class
        variable MB1 by doing this java will call child class method when we use
        default method in parents class without variable in method () only brecket no variable inside*/
        MB1.depositeMoney();
        MB1.openAccount();
        MB1.transferMoney();

        //Bank A1 =new MyBank();  /* new is child class object store in parents class
        //        variable MB1 by doing this java will call child class method when we use
        //        default method in parents class without variable in method () only brecket no variable inside*/
       // A1.depositeMoney();
       // A1.openanAccount();
       // A1.transferMoney();

    }
}// now make another two parents child class, extend it and make different method in both the class
// and then child class object store in parents class variable and try to call child class method it will says no
//try it and have a look.