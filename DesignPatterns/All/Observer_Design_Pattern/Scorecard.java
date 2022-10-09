import java.util.*;
class Scorecard implements ISubject{

    int runs;
    int overs;
    int wickets;

    List<IObserver> observers=new ArrayList<>();

    public void addObserver(IObserver o)
    {
        observers.add(o);
    }

    public void removeObserver(IObserver o)
    {
        int idx=observers.indexOf(o);

        observers.remove(idx);
    }

    public void setScore(int runs,int overs,int wickets)
    {
        this.runs=runs;
        this.overs=overs;
        this.wickets=wickets;

        notifyObservers();
    }

    public void notifyObservers()
    {
        for(IObserver o:observers)
        {
            o.update(runs,overs,wickets);
        }
    }

}