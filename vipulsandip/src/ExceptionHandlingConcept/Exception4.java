package ExceptionHandlingConcept;

public class Exception4 {
    public static void main(String[] args) throws ArithmeticException{
        Exception4 obj = new Exception4();
        obj.sum();
        System.out.println("ABCD");

    }
        public void sum()throws ArithmeticException{
            try{
                div();
            }
            catch (ArithmeticException e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

    }
        public void div() throws ArithmeticException{
        int a = 10/0;
    }
}
