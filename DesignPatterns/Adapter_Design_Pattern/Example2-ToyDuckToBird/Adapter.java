class Adapter{

    public static void main(String []args)
    {
        ToyDuck obj=new ToyDuck();
        ToyDuckToBirdAdapter adapter=new ToyDuckToBirdAdapter(obj);
        adapter.makeSound();   
    }
}