import java.util.*;
abstract class School{

    public List<String> EnrollAndGetSubjects(String name,String subject)
    {
            Student student=enrollStudent(name,subject);
            if(student==null)
            {
                System.out.println("Subject does not exist!");
                return new ArrayList<>();
            }
            return student.getSubjects();
    }

    public abstract Student enrollStudent(String name,String subject);  //This is the factory method

}