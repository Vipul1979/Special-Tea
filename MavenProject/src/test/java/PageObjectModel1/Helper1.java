package PageObjectModel1;

public class Helper1 {
    public void sleep(int ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
