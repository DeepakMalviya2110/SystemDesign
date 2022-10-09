class FlyweightDesignPattern{

    public static void main(String []args) //Only One Event Object to store data
    {
        Event event=new BirthdayEvent("Deepak's Birthday","October 21","Hoshangabad");
        InvitationCard card=new BirthdayInvitationCard("Tarun","Bangalore",event);
        card.getInvitation();
         InvitationCard card2=new BirthdayInvitationCard("Avijeet","Vidisha",event);
        card2.getInvitation();
    }

}