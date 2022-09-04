class DIPViolate{

    static class SoftwareEngineer{

        String name;
        public SoftwareEngineer(String name)
        {
            this.name=name;
        }

        void salary()
        {
            System.out.println("I am a software engineer and my salary is X");
        }

    }

    static class HRs{

        String name;
        public HRs(String name)
        {
            this.name=name;
        }
        
        void salary()
        {
            System.out.println("I am a HR and my salary is Y");
        }

    }

    static class Salary{

       SoftwareEngineer se;    //This is violation of Dependency Inversion Principle as One class is dependent on another.

       void processSalary(SoftwareEngineer se)
       {
            se.salary();
            System.out.println("Salary has been processed for "+se.name);
       }

    }

    public static void main(String []args)
    {
        Salary sal=new Salary();
        sal.processSalary(new SoftwareEngineer("Deepak"));
    }

}