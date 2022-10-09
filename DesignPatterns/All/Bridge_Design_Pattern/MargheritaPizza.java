class MargheritaPizza extends Pizza{

        public MargheritaPizza(Toppings topping)
        {
            super(topping);
        }
        
    public void name(){
        if(topping==null)
        {
            System.out.println("Margherita Pizza");
            return;
        }
        System.out.print("Margherita Pizza with ");
        topping.name();
    }

    public int cost(){
        if(topping==null)
        {
            return 100;
        }
        return 100+topping.cost();
    }

}