package IfElseCondition;

public class IfElseNest1 {
    public static void main(String[] args) {
        int c = 500;
        int d = 300;
        int e = 100;
// Nested if else

        if (c > d && d > e) { //True & True = True
            System.out.println("c is the greatest");
        } else if (d > e) {
            System.out.println("d is the greatest");
        } else {
            System.out.println("e is the greatest");
        }
    }

}
