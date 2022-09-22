import java.util.*;
class ArtsStudent implements Student{

    String name;

    public ArtsStudent(String name)
    {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return "Arts";
    }

     public List<String> getSubjects()
    {
        List<String> subjects=new ArrayList<>();
        subjects.add("History");
        subjects.add("Political Science");
        subjects.add("Economics");
        subjects.add("Geography");
        subjects.add("Sociology");
        return subjects;
    }

}