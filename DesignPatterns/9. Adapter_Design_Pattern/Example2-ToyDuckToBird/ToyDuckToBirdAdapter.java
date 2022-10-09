class ToyDuckToBirdAdapter implements IBird{
    
    ToyDuck obj;

    public ToyDuckToBirdAdapter(ToyDuck obj)
    {
        this.obj=obj;
    }

    public void makeSound()
    {
        obj.squeeze();
    }
}