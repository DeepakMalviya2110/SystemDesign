import java.util.*;
class CommerceStudent implements Student{

    String name;

    public CommerceStudent(String name)
    {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return "Commerce";
    }

    public List<String> getSubjects()
    {
        List<String> subjects=new ArrayList<>();
        subjects.add("English");
        subjects.add("Accountancy");
        subjects.add("Economics");
        subjects.add("Business Studies");
        subjects.add("Maths");
        return subjects;
    }
    
}