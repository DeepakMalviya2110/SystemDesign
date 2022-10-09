class ObserversDesignPattern{
    public static void main(String []args)
    {
        Scorecard scorecard=new Scorecard();
        IObserver display1=new ProjectedScoreDisplay();
        IObserver display2=new RunRateDisplay();
        IObserver display3=new RunsScoredDisplay();

        scorecard.addObserver(display1);
        scorecard.addObserver(display2);
        scorecard.addObserver(display3);

        scorecard.setScore(40,5,0);
        scorecard.setScore(60,10,3);
        scorecard.setScore(100,15,5);
        scorecard.setScore(140,18,6);

        scorecard.removeObserver(display1);
        scorecard.setScore(150,17,4);
    }
}