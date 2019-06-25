package ExceptionHandlingConcept;

public class Exception1 {
    public static void main(String[] args){
      try{
          int a=7/0;
      }
      catch(Throwable b){
          b.printStackTrace();
          System.out.println(b.getMessage());
          System.out.println("hi");
      }
        int d=8;
        int c=8;
        int f=d+c;
        System.out.println(f);
    }
}
