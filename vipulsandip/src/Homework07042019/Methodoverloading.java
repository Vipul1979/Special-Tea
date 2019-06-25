package Homework07042019;

public class Methodoverloading {
    public void plus(int a,int b){ // creat user define method with variable
        int c = (a+b);
        System.out.println(c);}

    public void plus(double d, double e){ //create same method with different method
        double Total= (d-e);
        System.out.println(Total);
    }
   public static void main(String[] args){ //create main method
        Methodoverloading obj = new Methodoverloading(); //create object
        obj.plus(20,10); //call the method
        obj.plus(2.5,5.5);
    }
}
