package Kodeit;

public class Addingmethod {
    public static void main(String[] args){
        Addingmethod obj = new Addingmethod(); //Creat object
        //this is static area calling instance method so create object
        //if you dont want to creat object then change user Grade method to static and call direclty
        obj.Grade("Vipul",57);
        obj.Grade("Ketan",87);
        obj.Grade("Sandip",97);
    }

    public void Grade(String studentName, int score){
        String grade;
        if(score>=90 && score<=100){
            grade = "A Congratulation you have achieved highest score";
        }
        else if(score>=80 && score<=89){
            grade = "B";
        }
        else if (score>=70 && score<=79){
            grade = "C";
        }
        else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName + " is : " + grade);
    }
}
/* Ans= Grade of Vipul is : D
Grade of Ketan is : B
Grade of Sandip is : A Congratulation you have achieved highest score
*/