class BirthdayInvitationCard extends InvitationCard{

    public BirthdayInvitationCard(String nameOfGuest,String postalAddress,Event event)
    {
        this.nameOfGuest=nameOfGuest;
        this.postalAddress=postalAddress;
        this.event=event;
    }

    public void getInvitation(){
        System.out.println("You are invited: "+nameOfGuest);
        System.out.println("Postal Address "+postalAddress);
        System.out.println("Event: "+event.eventName);
        System.out.println("On: "+event.eventDate);
        System.out.println("Location: "+event.eventAddress);
    }
}