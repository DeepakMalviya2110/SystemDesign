class TeamIterator implements Iterator{

    int idx;
    Player[] players;

    public TeamIterator(Player[] players)
    {
        idx=0;
        this.players=players;
    }

    public boolean hasNext()
    {
        return idx<players.length&&players[idx]!=null;
    }

    public Object next()
    {
        Player p=players[idx];
        idx++;
        return p;
    }
}