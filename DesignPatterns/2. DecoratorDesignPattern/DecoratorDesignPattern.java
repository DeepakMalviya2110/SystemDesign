class DecoratorDesignPattern{

    public static void main(String []args)
    {
        Pizza pizza=new MargheritaPizza();
        pizza=new MushroomToppingsDecorator(pizza);
        pizza=new ExtraCheezToppingsDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.cost());
    }

}