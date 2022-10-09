abstract class SchoolTripTemplate{

    void planTrip()   //Template Method
    {
        schoolFlag();
        budget();
        city();
        reservationToCity();
        hotelBooking();
    }

    public abstract void budget();

    public abstract void city();

    public abstract void reservationToCity();

    public abstract void hotelBooking();

    public final void schoolFlag()
    {
        System.out.println("School: Kendriya Vidyalaya No.1, Itarsi");
    }
}