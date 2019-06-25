package Constructors; //Specimen programme for Constructor

public class ConstructorConcept {
    String name; // Create class variable, instance variable or global variable
    int age;//global or class variable its call instance variable as well

        public ConstructorConcept(){ //Zero parameter constructor
            System.out.println("Default Const");
        /*public ConstructorConcept(){ //Zero parameter constructor
            System.out.println("Default Const");*/
        /*Duplicate const. not allow so we need to pass some parameter to keep it separate*/
        }
        public ConstructorConcept(int a){ /* one parameter constructor, compare to above we wrote 1 para
            so this is call constructor overloading - this is interview question, int a is call local variable
            as its written inside method*/
            System.out.println("1 parameter constructor");
        }
        public ConstructorConcept(int a, int b) { // two parameter constructor
            System.out.println("2 parameter constructor");
        }
        public ConstructorConcept(String name, int age){ // this variable is
            this.name=name; //this.class variable=local variable,
            // this means current class By using this key word we can make class var.
            // same as local variable
            //or you can write name=name; its also mean same first means is class global var and second name is local variable.
            this.age=age; //this.class variable=local variable
            // use this word when class (global) and local var. are same
            /* local vars different then above class variable, this variable call local variable,
            variable name is same so don't get confuse*/
            // different parameter constructor.

            }
                public static void main(String[] args){ //now declare main method
        ConstructorConcept obj = new ConstructorConcept(); // then create object in main method
        ConstructorConcept obj1 = new ConstructorConcept(10); //when we write 10 here it automatic allocate to sinlge parameter constructor
        ConstructorConcept obj2 = new ConstructorConcept(20,30);// Creat object an assing value
        ConstructorConcept obj3 = new ConstructorConcept("Sandip",25); //creat object and assign value

        System.out.println(obj3.name);
        System.out.println(obj3.age);
        }
}
//Note: 1Const. name has to be same as class name.
// 2.Class can have more then one constructor
// 3.Constructor can be over loaded in 0 para, 1 para, 2 parameter as many parameter
//4. Constructor can not return any value. no explicite return value.
//5.Const. always independent of each other, can not create inside method.
//6. Also duplicate const. not allow.
//6.const. use to allocate memory.
//7.if no parameter pass then
//8. We can write constructor anywhere but good practice to write after the class variable
//9. Cont. we use only to innitialize class variable, need to create n number of object to innitialize variables.
/*ans:Default Const
1 parameter constructor
2 parameter constructor
Sandip
25*/