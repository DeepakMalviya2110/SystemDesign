class TemplateMethodDesignPattern{

    public static void main(String []args)
    {
        ScoutGuide trip1=new ScoutGuide();
        trip1.planTrip();

        System.out.println("-----------------------");
        SportsTournament trip2=new SportsTournament();
        trip2.planTrip();
    }

}