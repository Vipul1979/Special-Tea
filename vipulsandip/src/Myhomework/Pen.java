package Myhomework;
//  need to review this pen programme again tomorrow  ?
// Need to make it as per ketanlal
public class Pen {
    //Step 1 Creat first user define method
    public void Fountainpen() {

    }

    //Step 2 Creat second user define method
    public void Bollpen() {
        String blue = ("Blue bollpen only use to write a note");
    }

    //Step 3 Now creat main method
    public static void main (String[] args){
        //Now call the first and second method in object
        Pen write = new Pen();
        write.Fountainpen();
        write.Bollpen();
        String red = ("Red fountain pen we use for audit");
        System.out.println("String");

    }
}
