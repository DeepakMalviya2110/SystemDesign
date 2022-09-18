class OnionToppingsDecorator extends Toppings{

    Pizza pizza;

    public OnionToppingsDecorator(Pizza pizza)
    {
        this.pizza=pizza;
    }


    public String getDescription()
    {
        return pizza.getDescription()+" with Onion Toppings";
    }

    public int cost(){
        return pizza.cost()+50;
    }
}