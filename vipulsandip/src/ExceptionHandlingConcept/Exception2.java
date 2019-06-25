package ExceptionHandlingConcept;

public class Exception2 {
    public static void main(String[] args){
        try {
            int a = 10 / 0; // this code will throw an exception
        }
        catch(ArithmeticException b){ //and its catch it here
           b.printStackTrace(); //this will print exception and in which line means where is exception.
           System.out.println(b.getMessage()); //this will print what is exception
        }
            System.out.println("ABC");
            System.out.println("ABC");
    }

}
