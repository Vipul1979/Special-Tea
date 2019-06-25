package operator;

public class preandpostoperator
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = a++;//post increment means alocate value of a to b first then increase by 1
        System.out.println(a);
        System.out.println(b);
        //ans; 1 and 2
        int c = 1;
        int d = ++c; //pre decrement vedio past 20 minute buddy vedio
        System.out.println(c);
        System.out.println(d);
    }
}
