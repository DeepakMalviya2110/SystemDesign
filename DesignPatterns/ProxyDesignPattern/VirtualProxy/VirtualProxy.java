import java.util.*;
class VirtualProxy{

        public static void main(String []args)
        {
            Proxy op=new OracleProxy();

            op.addEmployee(new Employee("Deepak"));
            op.addEmployee(new Employee("Gautam"));
            op.addEmployee(new Employee("Surya"));
            System.out.println(op.getEmployees());
             op.addEmployee(new Employee("Virat"));
            System.out.println(op.getEmployees());
        }

}