package Encapsulation;

public class EmployeeData {
    //step1; Declare private variable in classs
    private int dod;
    private String name;
    private int empage;
    //Step 3:
    public static void main(String[] args){
        EmployeeData emp = new EmployeeData();
        emp.setDod(20021990);
        emp.setEmpage(25);
        emp.setName("Vipul");
    System.out.println("employee dob:"+emp.getDod());
    System.out.println("employee age:"+emp.getEmpage());
    System.out.println("employee name:"+emp.getName());

    }
    // step 2: Call getter and setter method

    public int getDod() {
        return dod;
    }

    public void setDod(int dod) {
        this.dod = dod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }


    }

