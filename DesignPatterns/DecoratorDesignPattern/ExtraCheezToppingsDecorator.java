class ExtraCheezToppingsDecorator extends Toppings{

    Pizza pizza;

    public ExtraCheezToppingsDecorator(Pizza pizza)
    {
        this.pizza=pizza;
    }

    public String getDescription()
    {
        return pizza.getDescription()+" with Extra Cheez Toppings";
    }

    public int cost(){
        return pizza.cost()+100;
    }

}