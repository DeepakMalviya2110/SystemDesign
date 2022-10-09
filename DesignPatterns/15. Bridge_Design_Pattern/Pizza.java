abstract class Pizza{

    protected Toppings topping;

    protected Pizza(Toppings topping)
    {
        this.topping=topping;
    }

    public abstract void name();

    public abstract int cost();
}