package Myhomework;

public class Methodwithreturnvalue9 {
    public static String shape(String round,String square, String angle){
        return (round+square+angle);
    }

    public static void main (String[] args){
        String S1 = shape("Shape +1 is round, ","Shape +2 is square, ","Shape three is angle +3. ");
        System.out.println(S1);
    }

}
