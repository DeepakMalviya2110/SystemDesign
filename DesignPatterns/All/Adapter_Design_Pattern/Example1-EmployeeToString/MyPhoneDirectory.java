import java.util.*;

class MyPhoneDirectory implements IPhoneDirectory{

    IPhoneDirectory source;

    public MyPhoneDirectory(IPhoneDirectory source)
    {
        this.source=source;
    }

    public List<String> getAllPhoneNumbers(){
        return source.getAllPhoneNumbers();
    }

}