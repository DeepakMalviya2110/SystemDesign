class MushroomToppingsDecorator extends Toppings{

    Pizza pizza;

    public MushroomToppingsDecorator(Pizza pizza)
    {
        this.pizza=pizza;
    }


    public String getDescription()
    {
        return pizza.getDescription()+" with Mushroom Toppings";
    }

    public int cost(){
        return pizza.cost()+75;
    }

}