class CheezPizza extends Pizza{

        public CheezPizza(Toppings topping)
        {
            super(topping);
        }

        
    public void name(){
        if(topping==null)
        {
            System.out.println("Cheez Pizza");
            return;
        }
        System.out.print("Cheez Pizza with ");
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