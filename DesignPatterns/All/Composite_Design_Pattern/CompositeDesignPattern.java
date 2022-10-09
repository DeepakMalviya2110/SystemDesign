class CompositeDesignPattern{

    public static void main(String []args)
    {
        Component founder=new EmployeeComposite(1,"MS Dhoni","Founder",1000000);
        Component ceo=new EmployeeComposite(2,"Gautam Gambhir","CEO",500000);
        Component cfo=new EmployeeComposite(3,"Rohit Sharma","CFO",500000);
        Component manager1=new EmployeeComposite(4,"Virat Kohli","MANAGER",200000);
        Component manager2=new EmployeeComposite(5,"Jasprit Bumrah","MANAGER",200000);
        Component developer1=new EmployeeComposite(6,"Suryakumar Yadav","DEVELOPER",100000);
        Component tester1=new EmployeeComposite(7,"KL Rahul","TESTER",50000);
        Component developer2=new EmployeeComposite(8,"Yuzi Chahal","DEVELOPER",100000);

        founder.getDirects().add(ceo);
        founder.getDirects().add(cfo);

        ceo.getDirects().add(manager1);
        ceo.getDirects().add(manager2);

        manager1.getDirects().add(developer1);
        manager1.getDirects().add(tester1);

        manager2.getDirects().add(developer2);

        System.out.println("Monthly Spenditure for Salary Package of Team: "+founder.totalSalaryIncludingDirects());

        System.out.println("Monthly Spenditure for Salary Package of Development teams: "+(ceo.totalSalaryIncludingDirects()-ceo.salary()));

    }

}