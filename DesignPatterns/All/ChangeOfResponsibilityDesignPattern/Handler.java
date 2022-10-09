interface Handler{

    public abstract void setSuccessor(Handler next);

    public abstract void handle(int overs);

}