class RunRateDisplay implements IDisplay,IObserver{

    double rr;

    public void display()
    {
        System.out.println("Current Run Rate "+rr);
    }

    public void update(int runs,int overs,int wickets)
    {
        rr=(runs*1.0)/overs;
        display();
    }

}