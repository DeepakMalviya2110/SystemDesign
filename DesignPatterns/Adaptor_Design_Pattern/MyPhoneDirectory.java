import java.util.*;

class MyPhoneDirectory implements IPhoneDirectory{

    EmployeeToStringAdaptor etsa;

    public MyPhoneDirectory(EmployeeToStringAdaptor ds)
    {
        this.etsa=ds;
    }

    public List<String> getAllPhoneNumbers(){
        return etsa.getAllPhoneNumbers();
    }

}