package Array;

import java.util.ArrayList;

public class ArraylistConcept {
    static void add(int a){}
    public static void main(String[] args) {
        int a[] = new int[3]; //Static array size is fixed, to overcome this issue. we ar using arraylist Dynamic array
        /* Dynamic array -- Array list
        1. can contain duplicate value/elements
        2. maintain insertion order
        3. Synchronise
        4. allow random access to fetch the element because it stores the values on the basis
        of indexes */
        ArrayList ar = new ArrayList(); //ArrayList is a default classes
       //here we are storing non generic data type
        ar.add(10);
        ar.add("24/04/2019");
        ar.add(30);
        ar.add("Sandip");
        ar.add(null);
        ar.add('A');
        System.out.println(ar.size());//to get the size of ArrayList
        System.out.println(ar.get(4)); //to get the value of an index
        System.out.println(ar.get(0));
        System.out.println(ar.get(1));
        System.out.println(ar.get(2));
        //To print all value of arraylist
        //1. for loop
        //2. using iterator
        for (int i = 0; i < ar.size(); i++) {//to get value of all
            System.out.println(ar.get(i));
        }
        //non generic vs generic
        //Now here we are storing generic data type using <Integer>
        ArrayList<Integer>ar1=new ArrayList<Integer>(); //this is generic similar data type
        ar1.add(1000);
        ArrayList<String>ar2=new ArrayList<String>(); //this is generic similar data type
        ar2.add("Test");

        //How to store user define class object in array list

    }
}
        /* ans: 6
null
10
24/04/2019
30
10
24/04/2019
30
Sandip
null
A */
