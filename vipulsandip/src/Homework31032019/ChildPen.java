package Homework31032019;

public class ChildPen extends ParentsOffice {
    //void chair(){ Decode because same method can not be made as parents class method says final word
    //please refer ParentsOffice class to see final word
       // System.out.println("work hard");}
        public static void main(String[] args){
        ChildPen C1 = new ChildPen();
       C1.chair();
    }
}
/*like a wise final method if we make any class just writing in from of class name
final instead of public then we can not make any method under that classe please
refer https://www.javatpoint.com/final-keyword*/
