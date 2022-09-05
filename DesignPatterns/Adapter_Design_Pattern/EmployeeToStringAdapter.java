import java.util.*;

class EmployeeToStringAdapter implements IPhoneDirectory{

    List<Employee> Employees;

    public EmployeeToStringAdapter(List<Employee> list)
    {
        this.Employees=list;
    }

    public List<String> getAllPhoneNumbers()
    {
        List<String> al=new ArrayList<>();

        for(Employee emp:this.Employees)
        {
            al.add(emp.mobile);
        }

        return al;
    }

}