import java.util.*;
class ScienceStudent implements Student{

    String name;

    public ScienceStudent(String name)
    {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return "Science";
    }

    public List<String> getSubjects()
    {
        List<String> subjects=new ArrayList<>();
        subjects.add("English");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Computer Science");
        subjects.add("Maths");
        return subjects;
    }
    
}