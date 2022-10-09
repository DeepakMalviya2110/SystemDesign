import java.util.*;
class StudentFactory extends School{

     public Student enrollStudent(String name,String subject)
     {
        if(subject.equals("Arts"))
        {
            return new ArtsStudent(name);
        }
        else if(subject.equals("Science"))
        {
            return new ScienceStudent(name);
        }
        else if(subject.equals("Commerce")){
            return new CommerceStudent(name);
        }
        else{
            return null; 
        }
     }
    

}