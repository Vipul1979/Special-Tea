package Inheritance;

public class Testclassinheritance {
    public static void main (String[] args){

        Pen p1 = new Pen();
        p1.red();
        p1.blue();
        p1.table(); // using child object we can access all method father and grand father
        p1.chair();
        p1.whitboard();
        p1.permanant();
        Office O1 = new Office();
        O1.whitboard();
        O1.permanant();
        O1.table();
        O1.chair();
        // O1.red(); using parent object we can not call child method
    }
}
