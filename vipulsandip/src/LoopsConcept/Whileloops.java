package LoopsConcept;

public class Whileloops {
    public static void main (String[] args){
        //1: while loop:
        //dis advantage of while loop it will generate if you don't give incremental/decremental part
        int i=1;  //Step 1: Initialisation
        while(i<=10){  // Step 2: Conditional part  also this is while loop body
            //if above condition is true then it will go to next statement which is print i,
            System.out.print(i);  // result is 1 to 10 number
            i=i+1; //step 3: incremental/decremental
        }
        System.out.println("......");
        //while loop usind to reduce code or to avoid repititive method
        //2: For Loop
        // in java j++ means =j+1
        for(int j=1;j<=10;j++){ //Initialisation, condition, incremental
            System.out.print(j);
        }
        System.out.println(".....");
        //print 10 to 1
        //k--means k = k-1
        //10 9 8 7 6 5 4 3 2 1
        for(int k=10;k>=1;k--){
            System.out.print(k);
        } System.out.println("......");
    }
}
