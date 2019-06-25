package Homework07042019;

public class Switchpractice1 {
    public static void main (String[] args){ //main method
        String A = "Tuesday"; //declare instance class string variable
            switch (A){
                case "Monday":
                    System.out.println("Monday is a First day of the week)");
                break;
                case "Tuesday":
                    System.out.println("Tuesday is a Second day of the week");
                break; //if we remove break here then it will print tuesday and default both sop
                default:
                    System.out.println("Everyday is a good day");
            }
     }
}
