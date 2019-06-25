package Loops;
//instead of writing 10 line using while loop in 2 or 3 line we can write 1 to 10 .
/*disadvantage of while loop is,
// it will generate infinite loops if you don'g give incremental/ decremental value*/
public class whileLoops
{
    public static void main (String[] args)
    {
        int i=1; //initialisation
        while(i<=10)  //condition //while(condition){code to be executed
            {
            System.out.println(i);
            i = i+1;//increment and decrement
            }

    }
}//ans 1 to 10
