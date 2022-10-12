class MediatorDesignPattern{
    public static void main(String []args)
    {
        WaiterMediator waiter=new WaiterMediator();
        Cook cook1=new Cook(waiter);
        Cook cook2=new Cook(waiter);
        waiter.registerCook(cook1);
        waiter.registerCook(cook2);

        Customer customer1=new Customer("Deepak");
        customer1.order("Pizza");
        waiter.registerCustomer(customer1);
        waiter.takeOrder(customer1);

        Customer customer2=new Customer("Virat");
        customer2.order("Burger");
        waiter.registerCustomer(customer2);
        waiter.takeOrder(customer2);

    }
}