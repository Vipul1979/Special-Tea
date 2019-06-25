package Constructors;

public class Constructors1 {
    String name;
    int age;

    public Constructors1(){ //Zero parameter constructor
        System.out.println("Default Const");
        }
    public Constructors1(int a){
        System.out.println("1 parameter constructor");
    }
    public Constructors1(int a, int b) { // two parameter constructor

        System.out.println("2 parameter constructor");
    }
    public Constructors1(String name, int age){ // this variable is
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args){ //now declare main method
        Constructors1 obj = new Constructors1(); // then create object in main method
        Constructors1 obj1 = new Constructors1(10); //when we write 10 here it automatic allocate to sinlge parameter constructor
        Constructors1 obj2 = new Constructors1(20,30);// Creat object an assing value
        Constructors1 obj3 = new Constructors1("Tom",20); //creat object and assign value

        System.out.println(obj3.name);
        System.out.println(obj3.age);
    }
}/*ans:
Default Const
1 parameter constructor
        2 parameter constructor
        Tom
        20*/


