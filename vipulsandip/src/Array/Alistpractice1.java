package Array;

import java.util.ArrayList;

public class Alistpractice1 {
    public static void main(String[] args){
        //int a[]=new int[2];
        ArrayList ar = new ArrayList();
        ar.add(5);//0
        ar.add(15);//1
        ar.add(25);//2

        System.out.println(ar.size()+" "+"Index number");
        System.out.println(ar.get(2)+" "+"2nd index value");
        /* Ans: 3 Index
        25 2nd index value*/
        ar.add(35);//3
        ar.add(45);//4
        System.out.println(ar.size());
        System.out.println(ar.get(4));
    }
}
