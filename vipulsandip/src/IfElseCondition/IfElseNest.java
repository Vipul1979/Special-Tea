package IfElseCondition;

public class IfElseNest {
    public static void main(String[] args) {
        int c = 100;
        int d = 200;
        int e = 300;
// Nested if else

        if (c > d && d > e) { //false and false = false //Result- e is the greatest
            System.out.println("c is the greatest");
        } else if (d > e) {
            System.out.println("d is the greatest");
        } else {
            System.out.println("e is the greatest");
        }
    }

    }


