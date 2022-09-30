class Adapter{

    public static void main(String []args)
    {
        ToyDuck obj=new ToyDuck();
        IBird adapter=new ToyDuckToBirdAdapter(obj);
        adapter.makeSound();   //toy duck acting like bird using adapter
    }
}