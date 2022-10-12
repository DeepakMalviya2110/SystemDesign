class EventVisitor implements Visitor{
    
    public int visit(CricketMatchEvent event){
        int count=event.audienceCount;
        int entryTicket=event.entryTicket;
        return count*entryTicket;
    }

    public int visit(GarbaEvent event){
         int count=event.audienceCount;
        int entryTicket=event.entryTicket;
        return count*entryTicket;
    }

}