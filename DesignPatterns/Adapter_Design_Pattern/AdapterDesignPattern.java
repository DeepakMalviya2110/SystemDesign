import java.util.*;

class AdapterDesignPattern{

    public static void main(String []args)
    {
        ArrayList<Employee> Employees=Employee.details();
        EmployeeToStringAdapter etsa=new EmployeeToStringAdapter(Employees);
        System.out.println(etsa.getAllPhoneNumbers());
    }

}