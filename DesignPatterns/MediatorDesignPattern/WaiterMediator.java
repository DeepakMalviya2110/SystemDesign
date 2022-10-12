import java.util.*;
class WaiterMediator{
    List<Cook> cooks;
    List<Customer> customers;

    public WaiterMediator(){
        cooks=new ArrayList<>();
        customers=new ArrayList<>();
    }

    public void registerCook(Cook cook)
    {
        cooks.add(cook);
    }

    public void registerCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public void serveOrder(Customer customer){
        System.out.println("Your order is ready, "+customer.name);
    }

    public void takeOrder(Customer customer){
        for(int i=0;i<cooks.size();i++)
        {
            if(cooks.get(i).isAvailable)
            {
                cooks.get(i).cook(customer);
                break;
            }
        }
    }   
}