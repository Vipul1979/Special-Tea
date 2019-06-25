package Selflearning;

public class methodexample2 {
    void m1(int a, char ch){
        System.out.println("m1 method");
        System.out.println(a);
        System.out.println(ch);
    }
    public static void m2(String str, double d){
       System.out.println("m2 method");
       System.out.println(str);
       System.out.println(d);
    }
    public static void main (String[] args)
    {
        methodexample2 m = new methodexample2();
        m.m1(10,'v');
        methodexample2.m2("static method", 2.5);
    }
}


