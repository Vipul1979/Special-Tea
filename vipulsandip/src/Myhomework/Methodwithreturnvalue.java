package Myhomework;
public class Methodwithreturnvalue {
    public static void main(String[] args){
        int sum = addition(10, 50);//Create different variable in same datatype//
        int result = sum * 10;//Create different variable in same datatype//
        int a = result - 50;//Create different variable in same datatype//
        //System.out.println(sum);
        //System.out.println(result);
        System.out.println(a);
    }

    public static int addition(int a, int b) { //Create a UDM with use of method with return syntax//

        return (a + b); //Declare return variable by using the method with return syntex//
    }
}
//IMP: Return data type will be same but stored value will be different
//IMP: Sys out print will be in main method//
//IMP: Difference between argument and return method is in return method we dont need to create
//a different method for each argumetns






