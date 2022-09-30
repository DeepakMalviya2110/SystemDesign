class DryCleanersShop{

       DryingMachine dry;
       WashingMachine wash;
       PressingMachine press;

    public DryCleanersShop()
    {
        dry=new DryingMachine();
        wash=new WashingMachine();
        press=new PressingMachine();
    }

    public void dryClean(Cloth cloth)
    {
        wash.wash(cloth);
        dry.dry(cloth);
        press.press(cloth);
    }
}