package Loops;
//for loop will use most in selenium
public class forLoops
{
    public static void main(String[] args)
    {
         for(int i=1; i<=5; i++) //(initialisation;  condition;  incremental)
         {                       //i++ means i+1
             System.out.println(i);
             //ans 1 to 5
         }
        System.out.println("Now print 5 to 1 in reverse order");
         for(int r = 5; r>=1; r--) //(initialisation;  condition;  decremental)
                                     //r-- means r-1
           {
               System.out.println(r);
               //ans; 5 to 1 in reverse order
           }
    }

}

