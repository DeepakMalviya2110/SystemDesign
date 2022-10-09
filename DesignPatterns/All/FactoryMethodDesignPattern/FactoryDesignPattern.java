class FactoryDesignPattern{
    public static void main(String []args)
    {
        School school=new StudentFactory();
         System.out.println("Subjects for Deepak: "+school.EnrollAndGetSubjects("Deepak","Science"));
         System.out.println("Subjects for Akshat: "+school.EnrollAndGetSubjects("Akshat","Commerce"));
         System.out.println("Subjects for Vijay: "+school.EnrollAndGetSubjects("Vijay","Arts"));
         System.out.println("Subjects for Virat: "+school.EnrollAndGetSubjects("Virat","Sports"));
    }
}