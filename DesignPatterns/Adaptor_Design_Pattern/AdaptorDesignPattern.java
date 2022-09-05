import java.util.*;

class AdaptorDesignPattern{

    public static void main(String []args)
    {
        ArrayList<Employee> Employees=Employee.details();
        EmployeeToStringAdaptor etsa=new EmployeeToStringAdaptor(Employees);
        System.out.println(etsa.getAllPhoneNumbers());
    }

}