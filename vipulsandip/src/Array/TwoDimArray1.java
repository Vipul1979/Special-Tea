package Array;

public class TwoDimArray1 {
    public static void main(String[] args)
    {
        String a[][]=new String[3][4];
       //1st row
        a[0][0]="John";
        a[0][1]="35";
        a[0][2]="65";
        a[0][3]="A";
        //2nd row
        a[1][0]="Tom";
        a[1][1]="40";
        a[1][2]="75";
        a[1][3]="B";
        //3rd row
        a[2][0]="Richard";
        a[2][1]="30";
        a[2][2]="85";
        a[2][3]="c";

        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[0].length;col++){
                System.out.println(a[row][col]);
            }}
    }
}

