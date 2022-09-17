import java.util.*;

class AdapterDesignPattern{

    public static void main(String []args)
    {
        Employee employee=new Employee();
        EmployeeToStringAdapter etsa=new EmployeeToStringAdapter(employee);
        MyPhoneDirectory mpd=new MyPhoneDirectory(etsa);

        System.out.println(mpd.getAllPhoneNumbers());
    }

}