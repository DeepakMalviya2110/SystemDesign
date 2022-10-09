import java.util.*;
class EmployeeComposite implements Component{

    int empId;
    String name;
    String designation;
    int salary;
    List<Component> employees=new ArrayList<>();

    public EmployeeComposite(int empId,String name,String designation,int salary)
    {
        this.empId=empId;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }

    
    public int empId()
    {
        return empId;
    }

    
    public String name()
    {
        return name;
    }

    
    public String designation()
    {
        return designation;
    }

    
    public int salary()
    {
        return salary;
    }

    public List<Component> getDirects()
    {
        return employees;
    }

    public void addEmployee(Component e)
    {
        employees.add(e);
    }

    public void removeEmployee(int empId)
    {
        for(int i=0;i<this.employees.size();i++)
        {
            if(this.employees.get(i).empId()==empId)
            this.employees.remove(i);
        }
    }

     public int totalSalaryIncludingDirects(){
        int salary=this.salary;
        for(int i=0;i<employees.size();i++)
        {
            salary+=employees.get(i).totalSalaryIncludingDirects();
        }

        return salary;
     } 

}