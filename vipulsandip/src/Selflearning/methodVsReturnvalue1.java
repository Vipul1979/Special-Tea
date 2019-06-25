package Selflearning;

public class methodVsReturnvalue1 {
   ////method vs returning primitive value
    int m1()
    {   System.out.println("method m1");
            return 10;
    }
    double m2()
    {   System.out.println("method m2");
            return 10.5;
    }
    boolean m3()
    {   System.out.println("method m3");
            return true;
    }
    public static void main(String[] args)
    { methodVsReturnvalue1 a = new methodVsReturnvalue1();
        int m1 = a.m1();
        System.out.println("this method return int value ="+m1);
        double m2 = a.m2();
        System.out.println("this method return double value ="+m2);
        boolean m3 = a.m3();
        System.out.println("this method return booleam value ="+m3);
    }
}
