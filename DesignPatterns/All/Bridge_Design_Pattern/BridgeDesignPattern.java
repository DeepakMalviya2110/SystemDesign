class BridgeDesignPattern{      // Problem: Withoug Bridge Design Pattern, we required 3(toppings)*3(pizza)=9 classes, now we just need 3+3=6 classes.

    public static void main(String []args)
    {
        Pizza pizza=new PepperoniPizza(new DoubleCheezTopping());
        System.out.print("Pizza: ");
        pizza.name();
        System.out.println("Pizza Cost: "+pizza.cost());
    }

}