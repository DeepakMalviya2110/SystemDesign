class Display{

    Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void displayDecision()
    {
        command.execute();
    }
}