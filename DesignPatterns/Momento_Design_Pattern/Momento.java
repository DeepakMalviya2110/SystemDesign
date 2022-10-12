import java.util.*;
class Momento{

    HashMap<Integer,Color> hm;
    int version;

    public Momento()
    {
        version=1;
        hm=new HashMap<>();
    }

    public void saveMomento(Background background)
    {
            hm.put(version,background.color);
            version++;
    }

    public Color getMomento(int v)
    {
        if(!hm.containsKey(v))
        {
            System.out.println("Version not available");
            return null;
        }
        return hm.get(v);
    }

}