class PepperoniPizza extends Pizza{

        public PepperoniPizza(Toppings topping)
        {
            super(topping);
        }

        
    public void name(){
        if(topping==null)
        {
            System.out.println("Pepperoni Pizza");
            return;
        }
        System.out.print("Pepperoni Pizza with ");
        topping.name();
    }

    public int cost(){
        if(topping==null)
        {
            return 300;
        }
        return 300+topping.cost();
    }

}