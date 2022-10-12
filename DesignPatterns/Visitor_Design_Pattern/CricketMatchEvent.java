class CricketMatchEvent implements Event{

    int audienceCount;
    int entryTicket;

    public CricketMatchEvent(int audienceCount,int entryTicket)
    {
        this.audienceCount=audienceCount;
        this.entryTicket=entryTicket;
    }

    public int earnings(Visitor visitor)
    {
        return visitor.visit(this);
    }
}