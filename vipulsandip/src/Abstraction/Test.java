package Abstraction;

public class Test {

    public static void main (String[] args){
        Shape S1 = new Square();
        S1.drawing();
        S1.fill();/*here do not write sytem.out.print as sysout already written in abstract class
           so sysout will be printed out from abstract class*/
        S1.painting();
    }

}
