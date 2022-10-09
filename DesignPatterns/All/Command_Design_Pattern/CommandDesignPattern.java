class CommandDesignPattern{
    public static void main(String []args)
    {
        Display display=new Display();
        display.setCommand(new OutCommand());
        display.displayDecision();
         display.setCommand(new NotOutCommand());
        display.displayDecision();
    }

}