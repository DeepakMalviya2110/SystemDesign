class Strategy{
    public static void main(String []args)
    {
        Duck original=new OriginalDuck();
        original.display();
        original.doFly();
        original.doQuack();

        Duck wooden=new WoodenDuck();
        wooden.display();
        wooden.doFly();
        wooden.doQuack();

        Duck toy=new ToyDuck();
        toy.display();
        toy.doFly();
        toy.doQuack();

        toy.setFlyable(new FlyWithWings());
        wooden.setQuackable(new QueakingDuck());

        toy.display();
        toy.doFly();
        toy.doQuack();
        

        wooden.display();
        wooden.doFly();
        wooden.doQuack();
    }
}