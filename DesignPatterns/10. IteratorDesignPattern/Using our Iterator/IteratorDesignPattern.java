class IteratorDesignPattern{

    public static void main(String []args)
    {
        TeamPlayers team=new TeamPlayers();
        team.addPlayer(new Player("Gautam Gambhir",1));
        team.addPlayer(new Player("Rohit Sharma",2));
        team.addPlayer(new Player("Virat Kohli",3));
        team.addPlayer(new Player("SuryaKumar Yadav",4));
        team.addPlayer(new Player("Hardik Pandya",5));
        team.addPlayer(new Player("MS Dhoni",6));
        team.addPlayer(new Player("Ravindra Jadeja",7));
        team.addPlayer(new Player("Mohammad Shami",8));
        team.addPlayer(new Player("Yuzvendra Chahal",9));
        team.addPlayer(new Player("Zaheer Khan",10));
        team.addPlayer(new Player("Jaspreet Bumrah",11));

        team.addPlayer(new Player("Virendra Sehwag",12));

        Iterator iterator=team.createIterator();
        while(iterator.hasNext())
        {
            Player p=(Player)iterator.next();
            System.out.println(p.name+" bats at position "+p.position);
        }
    }
}