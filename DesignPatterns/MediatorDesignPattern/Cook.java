import java.lang.*;  
class Cook{
    WaiterMediator waiterMediator;
    Boolean isAvailable;

    public Cook(WaiterMediator waiterMediator)
    {
        this.waiterMediator=waiterMediator;
        this.isAvailable=true;
    }

    public void cook(Customer customer) throws Exception{
        this.isAvailable=false;
        System.out.println(customer.order+" is getting prepared");
        Thread.sleep(1000);
        System.out.println(customer.order+" is getting ready to serve");
        Thread.sleep(500);
        waiterMediator.serveOrder(customer);
        this.isAvailable=true;
    }

}