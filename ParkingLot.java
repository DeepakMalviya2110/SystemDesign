//Code Written By Deepak Malviya

//Requirements: You have two types of vehicles ie. Cars or Bikes
 //                You need to park them, create a Parking Lot Low Level Design



class ParkingSystem{
    public static void main(String[] args)
    {
        ParkingArea parkingArea=new ParkingArea();// Creating a Parking Area
        Bill.billId=1;
        Vehicle.vehicleId=1;


        Vehicle myCar=new Vehicle("MH01ZH2567","Car");
        Slot slot=parkingArea.entry(myCar);

        Vehicle myBike=new Vehicle("MP29VK1804","Bike");
        Slot slot2=parkingArea.entry(myBike);

        for(int i=0;i<10000000;i++)
        {

        }

        if(slot2!=null)
        {
            parkingArea.exit(slot2);
            slot2=null;
        }

        if(slot!=null)
        {
            parkingArea.exit(slot);
            slot=null;
        }

    }

    static class ParkingArea{

        Slot []carArray;
        Slot []bikeArray;

        public ParkingArea()
        {
            carArray=new Slot[5];
            bikeArray=new Slot[5];
        }

        public Slot entry(Vehicle vehicle)
        {
            return assignSlot(vehicle);
        }

        public void exit(Slot slot)
        { 
            generateBill(slot);
        }

        public void generateBill(Slot slot)
        {
            if(slot.slotType.equals("Car"))
            {
                carArray[slot.slotId]=null;
            }
            else{
                 bikeArray[slot.slotId]=null;
            }
            long departure=System.currentTimeMillis();
            long parkedTime=departure-slot.arrival;
            long amount=parkedTime*10;
            Bill bill=new Bill();
            bill.printBill(slot.vehicle,amount);
        }

        public int findSlot(String vehicleType)
        {
            if(vehicleType.equals("Car"))
            {
                for(int i=0;i<carArray.length;i++)
                {
                    if(carArray[i]==null)
                    {
                        return i;
                    }
                }
            }
            else{
                 for(int i=0;i<bikeArray.length;i++)
                {
                    if(bikeArray[i]==null)
                    {
                        return i;
                    }
                }
            }
            return -1;
        }


        public Slot assignSlot(Vehicle vehicle)
        {
            int vehicleId=Vehicle.vehicleId;
            Vehicle.vehicleId++;
            vehicle.vehicleId=vehicleId;
            if(vehicle.vehicleType.equals("Car"))
            {
                int slotId=findSlot("Car");
                if(slotId==-1)
                {
                    System.out.println("Sorry, No slots Available!");
                    return null;
                }
                vehicle.slotId=slotId;
                carArray[slotId]=new Slot(slotId,"Car",System.currentTimeMillis(),vehicle);
                System.out.println("Welcome "+ vehicle.vehicleNumber);
                return carArray[slotId];
            }
            else{
                int slotId=findSlot("Bike");
                 if(slotId==-1)
                {
                    System.out.println("Sorry, No slots Available!");
                    return null;
                }
                vehicle.slotId=slotId;
                bikeArray[slotId]=new Slot(slotId,"Bike",System.currentTimeMillis(),vehicle);
                System.out.println("Welcome "+ vehicle.vehicleNumber);
                return bikeArray[slotId];
            }
        }
    }



    static class Vehicle{
        static int vehicleId;
        String vehicleNumber;
        String vehicleType;
        int slotId;

        public Vehicle(String vehicleNumber,String vehicleType)
        {
            this.vehicleNumber=vehicleNumber;
            this.vehicleType=vehicleType;
        }
    }

    static class Slot{
        int slotId;
        String slotType;
        long arrival;
        Vehicle vehicle;

        public Slot(int slotId,String slotType,long arrival,Vehicle vehicle)
        {
            this.slotId=slotId;
            this.slotType=slotType;
            this.arrival=arrival;
            this.vehicle=vehicle;
        }
    }


    static class Bill{
        static int billId;

        public void printBill(Vehicle vehicle,long amount)
        {
            System.out.println("Bill Id: "+this.billId);
            this.billId++;
            System.out.println("Welcome Back soon "+vehicle.vehicleNumber);
            System.out.println("Parking Fees: "+amount);
        }
    }


}