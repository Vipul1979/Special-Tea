package Interface;

public class TestInterfaceclass {
    public static void main (String[] args){
        RBIindia R1 = new RBIindia();
        R1.mortgage();
        R1.overdraft();
        R1.personalloan();
        USbank U1 =new RBIindia(); // new RBIindia is object of USbank interface class variable U1
        //so we can say above statment that Interface parents class variable can only refer child class
        //object but can not take property of child class. here new RBIindia is different ojbect is not an object we used to creat for method.

        //this is call child class object refer to interface class variable
        U1.mortgage();
      /*  U1.bankinterest();//interface variable will be refered  by child class
      object but interface variable can not take property of child class */
        System.out.println("...");

        R1.bankinterest();
        R1.bankaccount();

    }
}
