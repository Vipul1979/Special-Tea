package ExceptionHandlingConcept;

public class Exception5 {
    public static void main(String[] args){
        try{
            int a = 10/0;
        }
        catch (Throwable a){
            a.printStackTrace();
            System.out.println(a.getMessage());
        }       System.out.println("How");
                System.out.println("ARE");
    }

}
