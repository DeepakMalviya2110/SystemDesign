class FacadeDesignPattern{

    public static void main(String []args)
    {
        //We have to get our cloths ready, but we don't have much time
        //But we don't have any option? Then lets manage somehow.
        Cloth shirt=new Cloth("Shirt");
        DryingMachine dry=new DryingMachine();
        WashingMachine wash=new WashingMachine();
        PressingMachine press=new PressingMachine();

        wash.wash(shirt);
        dry.dry(shirt);
        press.press(shirt);

        System.out.println("----------------Next Day----------------");


        //But someone suggest something, why can't you give it to DryCleanersShop?
        //Well, this is a good idea.

        Cloth coat=new Cloth("Coat");
        DryCleanersShop shop=new DryCleanersShop();
        shop.dryClean(coat);  //Facade's example-> Let the subsystem solves the problems.
    }

}