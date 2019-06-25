package Abstraction;

public abstract class Shape {
    //to make method abstract type ab in between public an class

    abstract void drawing(); //only declare(initialise) abstract method, no implement

    abstract void painting();//only method declaration but no implementation
    public void fill(){  //but we can declare and implimentation user define method
        System.out.println("this is first programme"); //impliment means take print out

                //in abstraction we can create abstract and user define both method
            // in interface we can only create interface method
    }
}
/*IMP: 1. in interface no method body so all method are 100% interface
but here in abstraction we use abstract and user define both method
so abstract method may be between 1% to 100%
 */
//Abstract class can not create object
//In abstraction child class creat object and refer to abstract class variable
/*When we extend child class with abstract class it shows error tp resolve it
in child class right click Generat implement method now error will be resolve*/
