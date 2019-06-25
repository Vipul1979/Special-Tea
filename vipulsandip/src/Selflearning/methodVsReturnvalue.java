package Selflearning;
//method vs returning primitive value
public class methodVsReturnvalue {
    int m1()
    {   System.out.println("m1 method");
        return 10;
    }
    float m2()
    {   System.out.println("m2 method");
        return 10.5f; //defaulf double but for float need to write f at the and
    }
    static char m3()
    {   System.out.println("m3 method");
        return 'a';
    }
    public static void main(String[] args)
    {   methodVsReturnvalue t = new methodVsReturnvalue(); //create object new methVsRet is object of t ref variable
        int x = t.m1(); //calling m1 method but it contain int value so to catch value create ref variable int type
        System.out.println("return value of int method m1=" +x);
        float f = t.m2();
        System.out.println("return value of float method m2 = "+f);
        char c = t.m3();
        System.out.println("return value of char method m3 = "+c);
    }
}       /*Ans=
            m1 method
            return value of int method m1 = 10
            m2 method
            return value of float method m2 = 10.5
            m3 method
            return value of char method m3 = a
         */
