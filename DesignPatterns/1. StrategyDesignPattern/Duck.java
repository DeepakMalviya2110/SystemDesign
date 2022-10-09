abstract class Duck{
    IFlyable flyable;
    IQuackable quackable;

    public void setFlyable(IFlyable flyable)
    {
        this.flyable=flyable;
    }

    public void setQuackable(IQuackable quackable)
    {
        this.quackable=quackable;
    }

    public void doQuack()
    {
        quackable.quack();
    }

    public void doFly()
    {
        flyable.fly();
    }

    public abstract void display();
    
}