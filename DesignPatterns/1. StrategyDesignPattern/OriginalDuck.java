class OriginalDuck extends Duck{

    public OriginalDuck()
    {
        flyable=new FlyWithWings();
        quackable=new QuackingDuck();
    }

    public void display()
    {
        System.out.println("I am an original duck");
    }
}