package Loops;

public class ForEachLoop {
    public static void main(String[] args){
        double[] mylist = {1.1, 2.2, 3.3, 4.4};
        for(double element:mylist){ //element=mylist here mylist value saved in element
            System.out.println(element); //now print element
        }
    }
}
//Output :
// 1.1
//2.2
//3.3
//4.4