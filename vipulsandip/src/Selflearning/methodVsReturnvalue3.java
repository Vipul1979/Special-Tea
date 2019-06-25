package Selflearning; //Page 42, vedio 9, 25 minute
//method vs return object , object as a return data type value
class Employee{} // Employee class object as return data type
class Job{} //Job class object as return data type
public class methodVsReturnvalue3 {
    Employee m1()
    {   System.out.println("m1 method");
        Employee e = new Employee();
        return e; //in one line can write // return new Employee();
    }
    Job m2()
    {   System.out.println("m2 method");
        Job a = new Job();
        return a; //return new Job();
    }
        static String m3()
        {   System.out.println("m3 method");
            return "ratan";
        }
    public static void main (String[] args)
    {   methodVsReturnvalue3 obj = new methodVsReturnvalue3(); // creat object
        Employee e1 = obj.m1(); //to store object creat Employee class variable , can give any name to variable
        System.out.println(e1);
        Job a1 = obj.m2(); // to store object creat Job class variabl, can give different name to job class variable
        System.out.println(a1);
        String Str  = obj.m3(); // to store object create String class variable, give any name to String class variable.
        System.out.println(Str);
    }
}/*ans:m1 method
Selflearning.Employee@1b6d3586 // this print some hascode it will discuss in future lesson
m2 method
Selflearning.Job@4554617c   //// this print some hascode it will discuss in future lesson. how to identify hascod
m3 method
ratan*/

