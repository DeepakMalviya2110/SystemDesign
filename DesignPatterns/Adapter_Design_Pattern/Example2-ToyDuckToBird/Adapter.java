class Adapter{

public static void main(String []args)
{
    ToyDuck obj=new ToyDuck();
    ToyDuckToBirdAdapter adap=new ToyDuckToBirdAdapter(obj);

    Bird bird=new Bird(adap);
    
    bird.makeSound();
}

}