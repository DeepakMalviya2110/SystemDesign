class ToyDuck extends Duck{

    public ToyDuck()
    {
        flyable=new NoFly();
        quackable=new QueakingDuck();
    }

    public void display()
    {
        System.out.println("I am a toy duck");
    }
}