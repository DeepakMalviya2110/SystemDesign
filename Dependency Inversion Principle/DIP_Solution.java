class DIPSolution{

    interface Employee{
        public void salary();

        String getName();
    }

    static class SoftwareEngineer implements Employee{

        String name;
        public SoftwareEngineer(String name)
        {
            this.name=name;
        }

        public String getName()
        {
            return name;
        }

        public void salary()
        {
            System.out.println("I am a software engineer and my salary is X");
        }

    }

    static class HRs implements Employee{

        String name;
        public HRs(String name)
        {
            this.name=name;
        }

        public String getName()
        {
            return name;
        }
        
        public void salary()
        {
            System.out.println("I am a HR and my salary is Y");
        }

    }

    static class Salary{

    Employee emp;    //Here Salary depends on Interface

       void processSalary(Employee emp)
       {
            emp.salary();
            System.out.println("Salary has been processed for "+emp.getName());
       }

    }

    public static void main(String []args)
    {
        Salary sal=new Salary();   
        Employee emp=new SoftwareEngineer("Deepak");  //Here Software Engineer depends upon interface
        sal.processSalary(emp);
    }

}