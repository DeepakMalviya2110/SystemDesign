import java.util.*;
interface Company{

    public void addEmployee(Employee e);

    public void removeEmployee(Employee e);

    public String getName();

    public String getLocation();

    public List<Employee> getEmployees();

}