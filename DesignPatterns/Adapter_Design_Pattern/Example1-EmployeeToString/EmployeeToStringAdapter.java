import java.util.*;

class EmployeeToStringAdapter implements IPhoneDirectory{

    Employee emp;

    public EmployeeToStringAdapter(Employee emp)
    {
        this.emp=emp;
    }

    public List<String> getAllPhoneNumbers()
    {
        List<String> al=new ArrayList<>();

        for(Employee emp:emp.details())
        {
            al.add(emp.mobile);
        }

        return al;
    }

}