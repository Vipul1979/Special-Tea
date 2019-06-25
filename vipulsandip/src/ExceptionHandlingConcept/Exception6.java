package ExceptionHandlingConcept;

public class Exception6 {
    public static void main(String[] args){
        System.out.println("Smith");

        try {
            throw new Exception("throw own exception");//when we throw Exception it will show erroe
            //red bulb here when we click on it it will give option to handle with sounded by try catch block
        } catch (Exception e) {
            e.printStackTrace();
        }//if we dont use try catch block and handle exception then
        //programme will be terminated and Patel will not get printed

        System.out.println("Patel");

    }
}
