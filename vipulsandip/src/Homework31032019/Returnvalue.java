package Homework31032019;
/*Exercise-VI:
1. Create a class with few methods with return value
and call those methods and print the return values*/
public class Returnvalue {
    public static void main(String[] args) {
        int addition = addition(10, 20, 30, 40);
        int multiplication = multiplication(20,30);
        int substraction = substraction(50,20);
        System.out.println(addition);
        System.out.println(multiplication);
        System.out.println(substraction);
    }
    public static int addition (int a, int b, int c, int d){
        return (a+b+c+d);
    }
    public static int multiplication(int a, int b){
        return (a*b);
    }
    public static int substraction(int a, int b){
        return (a-b);
    }
}
