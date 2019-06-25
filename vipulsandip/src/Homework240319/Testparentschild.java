package Homework240319;

public class Testparentschild {
    public static void main (String[] args){ // Declare main method
        Class2child C2 = new Class2child(); //
        C2.addition(3,4); //Declare value in main method not in user define class and it will take a and b automatically
        C2.substraction(10,5); // same as above

    }
}
//IMP  Note 1:enter variable value in main method
/* Note 2: Do not assing value in user define method always assing
value in main method as main method always do the calculation*/
//Note 3: Also always create object in main method
/* Note 3: To get message in self explainatory way is to use concotation syntax please check
system out print messege in parents and child class*/
