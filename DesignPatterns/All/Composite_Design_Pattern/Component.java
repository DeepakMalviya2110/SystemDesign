import java.util.*;
interface Component{

    public String name();

    public String designation();

    public int salary();

    public int empId();

    public void addEmployee(Component e);

    public List<Component> getDirects();

    public int totalSalaryIncludingDirects();

}