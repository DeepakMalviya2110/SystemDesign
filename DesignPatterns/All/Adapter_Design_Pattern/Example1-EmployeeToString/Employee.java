import java.util.*;

class Employee{

    String name;
    int id;
    String mobile;

    public Employee()
    {

    }

    public Employee(String name,int id,String mobile)
    {
        this.name=name;
        this.id=id;
        this.mobile=mobile;
    }

    public ArrayList<Employee> details()
    {
        ArrayList<Employee> al=new ArrayList<>();

        al.add(new Employee("Deepak",123,"9876543210"));
        al.add(new Employee("Virat",456,"0123456789"));
        al.add(new Employee("Tarun",456,"9914172214"));

        return al;
    }

}