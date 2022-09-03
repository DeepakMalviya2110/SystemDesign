//Code Written By Deepak Malviya

//Requirements: You have two types of vehicles ie. Cars or Bikes
 //                You need to park them, create a Parking Lot Low Level Design



class ParkingSystem{
    
    static int vId; //this is static

    public interface VehicleType{

        public int assignSlot(Vehicle vehicle);   //Taking in Vehicle and assigning slot id

        public void releaseSlot(int slotId,int fee);  //Release the slot

    }

    public static class Parking implements VehicleType{

        Slot[] arr;

        public void createSlot()
        {
            arr=new Slot[5];
        }

        public int assignSlot(Vehicle vehicle)
        {
            for(int i=0;i<this.arr.length;i++)
            {
                if(this.arr[i]==null)
                {
                    System.out.println("Welcome "+vehicle.vehicleNumber);
                    this.arr[i]=new Slot(i,System.currentTimeMillis(),vehicle);
                    vehicle.slotId=i+1;
                    vehicle.vehicleId=vId;
                    vId++;
                    return i+1;
                }
            }
            return -1;
        }

        public void releaseSlot(int slotId,int fee)
        {
            Slot s=this.arr[slotId-1];

            long dep=System.currentTimeMillis();
            long fees=fee*(dep-s.arrival);

           Bill.print(s.vehicle,fees,dep-s.arrival);

           this.arr[slotId-1]=null;
        }
    }

    public static class BikeParking extends Parking{

        public static int getFees()
        {
            return 20;
        }
    }

    public static class CarParking extends Parking{

        public CarParking()
        {
            createSlot();
        }

         public static int getFees()
        {
            return 50;
        }
    }

    public static class BusParking extends Parking{

         public static int getFees()
        {
            return 200;
        }
    }

    public static void main(String[] args)
    {
        CarParking cp=new CarParking();

        BikeParking bp=new BikeParking();

        BusParking busp=new BusParking();

        vId=0;

        Vehicle myCar=new Vehicle("MH01ZH2567");
        int slotId=cp.assignSlot(myCar);

        if(slotId==-1)
        {
            System.out.println("Sorry!! No Slot Available!!");
        }

          Vehicle myCar2=new Vehicle("MH05DF4556");
        int slotId3=cp.assignSlot(myCar2);

        if(slotId==-1)
        {
            System.out.println("Sorry!! No Slot Available!!");
        }

         Vehicle myBike=new Vehicle("DL24GG1410");
         int slotId2=bp.assignSlot(myBike);

         if(slotId2==-1)
        {
            System.out.println("Sorry!! No Slot Available!!");
        }

        
        Vehicle myBus=new Vehicle("CG24AG4100");
         int slotIdB1=busp.assignSlot(myBus);

         if(slotIdB1==-1)
        {
            System.out.println("Sorry!! No Slot Available!!");
        }

        for(int i=0;i<10000000;i++)
        {

        }

        if(slotId2!=-1)
        bp.releaseSlot(slotId2,bp.getFees());

        if(slotId!=-1)
        cp.releaseSlot(slotId,cp.getFees());

        if(slotId3!=-1)
        cp.releaseSlot(slotId3,cp.getFees());

        if(slotIdB1!=-1)
        busp.releaseSlot(slotIdB1,busp.getFees());
    }

    static class Vehicle{
        int vehicleId;   //primary key
        String vehicleNumber;
        int slotId;      //foreign key

        public Vehicle(String vehicleNumber)
        {
            this.vehicleNumber=vehicleNumber;
        }
    }

    static class Slot{
        int slotId;      //primary key
        long arrival;
        Vehicle vehicle;    //foreign key

        public Slot(int slotId,long arrival,Vehicle vehicle)
        {
            this.slotId=slotId;
            this.arrival=arrival;
            this.vehicle=vehicle;
        }

        
    }


    static class Bill{
        int billId;

        public static void print(Vehicle vehicle,long amount,long time)
        {
            System.out.println("Welcome Back soon "+vehicle.vehicleNumber);
            System.out.println("Time: "+time+" Hr");
            System.out.println("Parking Fees: "+amount);
        }
    }


}