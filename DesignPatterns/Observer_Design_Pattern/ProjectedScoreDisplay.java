class ProjectedScoreDisplay implements IDisplay,IObserver{
    
    double projectedScore;

    public void display()
    {
        System.out.println("Projected Score: "+projectedScore);
    }

    public void update(int runs,int overs,int wickets)
    {
        double crr=runs*1.0/overs;
        double moreRuns;
        if(wickets>3)
        {
            moreRuns=(1.5*crr)*(20-overs);
        }
        else{
            moreRuns=(2*crr)*(20-overs);
        }

        this.projectedScore=runs+moreRuns;
        display();

    }

}