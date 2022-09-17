
class Bird implements IBird{

    IBird bird;

    public Bird(IBird bird)
    {
        this.bird=bird;
    }

    public void makeSound()
    {
        bird.makeSound();
    }
}