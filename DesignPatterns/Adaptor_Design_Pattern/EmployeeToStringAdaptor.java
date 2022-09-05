import java.util.*;

class EmployeeToStringAdaptor implements IPhoneDirectory{

    List<Employee> Employees;

    public EmployeeToStringAdaptor(List<Employee> list)
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