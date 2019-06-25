package Array;

public class Arrayclass {
    public static void main (String[] args)
    {
        //dis advantage of array:
        //1.Size is fixed--static array--to overcome this issue we use collection-- Array list, hashtable--use dynamic array
        //2. Store only similar data type--To overcome this problem,we use object array.
        //1. int array
        int a[] = new int[4];//int a is normal variable and int a[] is int array variable
        // but how to create array variable using [] after variable.
        //syntax to create array variable is data type[] variable name;
        // or declare variable and assign value or define variable
        //int a[] = new int[n] n is size of array
        //now as we said above size is 4 so we need to divide in for variable
        a[0] = 11;
        a[1] = 22;
        a[2] = 33;
        a[3] = 44; //can not store 44.5 coz int variable
        System.out.println(a[2]); //ans; 33
        System.out.println(a[0]);//ans; 11
        System.out.println(a[3]);//ans; 44
        //System.out.println(a[4]);//ans ArrayIndexOutOfBoundsException: 4 this is 5th value 5-1 value
        System.out.println(a.length);// ans 4 as size of array is 4
        //print all the values of array: use for loop
        for(int b=0;b<a.length;b++) //a.length or we can write size of array directly 4
        System.out.println(a[b]); //ans: 11,22,33,44 in following line
        //2. Double data type
        double c[] = new double[3];
        c[0] = 11.5;
        c[1] = 22.5;
        c[2] = 33.5;
        System.out.println(c[2]); // ans will be 33.5
        System.out.println(c.length);// ans will be 3 which is size of the array
        // using for loop in double data type where we use only int as index no has to be int
        for (int d=0;d<c.length;d++){ //index number cant be double so have to use int
          System.out.println(c[d]);
    }
    //3. char array
        char e [] = new char[3];
        e[0]= 'f';
        e[1]= 'g';
        e[2]= 'h';
            System.out.println(e[1]); //answer is g
            System.out.println(e.length); // ans: 3 length is 3
    //for loop in char
        for (char i=0;i<3;i++){ //char in for loop consider as int // i<e.length
            System.out.println(e[i]); // ans f g h
        }
        //4. boolean array:
        boolean j [] = new boolean[2];
        j[0] = true;
        j[1] = false;
            System.out.println(j[0]); // ans will be true
        //5. String array
        String k[]=new String[3];
        k[0]="How";
        k[1]="are";
        k[2]="you today!";
            System.out.println(k[0]);
            System.out.println(k[1]);
            System.out.println(k[2]);
            // using for loop
        //Array only use to store similar data tape but to overcome this issue we use object

        //6. Object array //Object with O capital is super class, is used to store different data type values
        Object ob[]=new Object[6]; //Object o capital
        ob[0]="Tom";
        ob[1]=15;
        ob[2]=5.5;
        ob[3]="1/1/1980";
        ob[4]='M';
        ob[5]="London";
            System.out.println(ob[5]);
            System.out.println("Object array length is " +ob.length);
            System.out.println("To print all the different data type use for loop");
            for( int v=0; v<6; v++) { //or you can write v<ob.length
                System.out.println(ob[v]);
            }
    }//ans: London and length is 6
}
/*Note:
//to store similar data type value
        //lowest bound index is 0
        //upper bound/index  = n-1(n is size of array)
        //one dimensional array
// Dis advantage of array
1. Size is fixed - Static array - to overcome this issue we use Collection, Arraylist,
Hashtable--use dynamic array
2. store similar data type - to overcome this problem we use object array
 */

