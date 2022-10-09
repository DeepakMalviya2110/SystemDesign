class RunsScoredDisplay implements IDisplay,IObserver{

    int runs;
    public void display()
    {
        System.out.println("Runs "+runs);
    }

    public void update(int runs,int overs,int wickets)
    {
        this.runs=runs;
        display();
    }

}