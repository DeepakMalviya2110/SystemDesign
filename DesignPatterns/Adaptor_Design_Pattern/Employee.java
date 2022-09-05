import java.util.*;

class Employee{

    String name;
    int empid;
    String mobile;

    public Employee(String name,int empid,String mobile)
    {
        this.name=name;
        this.empid=empid;
        this.mobile=mobile;
    }

    public static ArrayList<Employee> details()
    {
        ArrayList<Employee> al=new ArrayList<>();

        al.add(new Employee("Deepak",123,"9876543210"));
        al.add(new Employee("Virat",456,"0123456789"));
        al.add(new Employee("Tarun",456,"9914172214"));

        return al;
    }

}