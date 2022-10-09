class StateHandled implements State{

    State state;

    public StateHandled(State state)
    {
        this.state=state;
    } 

    public void setState(State state)
    {
        this.state=state;
    }

    public void context()
    {
        state.context();
    }

}