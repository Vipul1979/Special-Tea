package IfElseCondition;

public class IfElseConcept3 {
    public static void main (String[] args){
        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;
//Nested if else
        if(a>b && b>c && c>d)
            { //false then will not print SOP and go to next else
                System.out.println("a is greatest");
            }
        else if(b>c && c>d)
            { // false - then go to next else condition
                System.out.println("b is greatest");
            }
        else if (c>d)
            { //false - then go to next else condition
                System.out.println("c is greatest");
            }
        else //this is true and nothing to compare so print this SOP
            {  //Here we dont write anything in () because we have compare a to b, b to c,
            //c to d, at last d alon nothing there to compare so that we dont write anyhting in brecket
            System.out.println("d is greatest"); // this is the result
            }
    }
}//Ans:d is greatest

