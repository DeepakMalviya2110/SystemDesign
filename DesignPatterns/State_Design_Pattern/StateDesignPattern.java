class StateDesignPattern{

    public static void main(String []args)
    {
        StateHandled obj=new StateHandled(new TicketRaisedState());
        obj.context();
        obj.context();

        obj.setState(new InProgressState());
        obj.context();
        obj.setState(new CustomerUpdatedState());
        obj.context();
        obj.setState(new InProgressState());
        obj.context();
        obj.setState(new ResolvedState());
        obj.context();
    }    
}