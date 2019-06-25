package Selflearning;
class X{}
class Emp{}
class Y{}
class Student{}
public class methodexample3
{
    void m1(X x, Emp e)
    { System.out.println("m1 method");
    }
    static void m2(Y y, Student s)
    {   System.out.println("m2 method");
    }
    public static void main(String[] args) {
        methodexample3 m = new methodexample3();
        X x = new X();
        Emp e = new Emp();
        m.m1(x, e);
        //or above 3 line code we can write in one line
        //m.m1(new X(), new Emp());
        Y y = new Y();
        Student s = new Student();
        methodexample3.m2(y, s);
        //Test.m2(new Y(), new Student());
    }

 }


