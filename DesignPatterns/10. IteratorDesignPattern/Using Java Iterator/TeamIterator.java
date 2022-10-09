import java.util.Iterator;
class TeamIterator implements Iterator<Player>{

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

    public Player next()
    {
        Player p=players[idx];
        idx++;
        return p;
    }
}