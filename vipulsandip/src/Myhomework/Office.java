package Myhomework;

public class Office {
    //Step 1 Creat first user define method
    public void Table() {
        System.out.println("Everyone has to work on their own table");
    }

    //Step 2 Creat second user define method
    public void Chair() {
        System.out.println("Chair has to be comfortable as need to work long hours");
    }

    //Step 3 Now creat main method
    public static void main (String[] args){


        //Step 4 Creat Object classname object = new classname
        Office pen = new Office();
        //Now call the first and second method in object
        pen.Table();
        pen.Chair();
    }
}
