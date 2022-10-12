class VisitorDesignPattern{
    public static void main(String []args)
    {
        Event []events={new CricketMatchEvent(55000,1500),new GarbaEvent(3000,300),new GarbaEvent(25000,200)};
        int earnings=getTotalEarning(events);
        System.out.println("Total Earnings: "+earnings);
    }

    public static int getTotalEarning(Event []events)
    {
        Visitor visitor=new EventVisitor();
        int sum=0;
        for(Event event: events)
        {
            sum+=event.earnings(visitor);
        }
        return sum;
    }

}