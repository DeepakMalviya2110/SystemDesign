class TeamPlayers{

    Player []players;
    int idx;

    public TeamPlayers()
    {
        idx=0;
        players=new Player[11];
    }

    public void addPlayer(Player p)
    {
        if(idx==players.length)
         {
            System.out.println("Team is completed, Can't add player: "+p.name);
            return;
         }

        players[idx]=p;
        idx++;
    }

    public Iterator createIterator()
    {
        return new TeamIterator(players);
    }
}