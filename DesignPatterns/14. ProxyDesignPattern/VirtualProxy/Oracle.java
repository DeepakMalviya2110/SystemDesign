import java.util.*;
class Oracle implements Company{

    List<Employee> employees;

    public Oracle()
    {
        employees=new ArrayList<>();
    }

    public void addEmployee(Employee e)
    {
        employees.add(e);
    }

    public void removeEmployee(Employee e)
    {
        employees.remove(e);
    }

    public String getName(){
        return "Oracle";
    }

    public String getLocation(){
        return "Hyderabad";
    }

    public List<Employee> getEmployees(){
        return employees;
    }

}