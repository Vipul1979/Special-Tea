 package ExceptionHandlingConcept;
//Use of throws keyword
public class Exception3 {
    public static void main(String[] args) throws ArithmeticException{
        //3. now we are callingsum method (sum method callig div which got excetion.
        //now exception handle by JVM.
        Exception3 obj = new Exception3();
        obj.sum();
    }
        public void sum()throws ArithmeticException{
                div(); //1.sum method throws key work so that main method can catch it.
        }
        public void div()throws ArithmeticException{
            int a =9/0;//2.exception line div method throw exception so that sum method catch it.
        }

    }

