import java.util.*;
class OracleProxy implements Proxy{

    Company company;

    public void addEmployee(Employee e){
        if(company==null)
        {
            System.out.println("Creating Oracle Object...");
            company=new Oracle();
        }

        company.addEmployee(e);
    }

    public void removeEmployee(Employee e){
         if(company==null)
        {
            System.out.println("Creating Oracle Object...");
            company=new Oracle();
        }

        company.removeEmployee(e);
    }

    public List<String> getEmployees()
    {
        if(company==null)
        {
            System.out.println("Creating Oracle Object...");
            company=new Oracle();
        }

        System.out.println("Fetching Oracle Employees...");
        List<String> al=new ArrayList<>();
        List<Employee> ret=company.getEmployees();
        for(int i=0;i<ret.size();i++)
        {
            al.add(ret.get(i).name);
        }
        return al;
    }
}