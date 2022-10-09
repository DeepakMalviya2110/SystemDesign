class WoodenDuck extends Duck{


    public WoodenDuck()
    {
        flyable=new NoFly();
        quackable=new NoQuack();
    }

    public void display()
    {
        System.out.println("I am a wooden duck");
    }

}