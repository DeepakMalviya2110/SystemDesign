class AppleEngineer implements Engineer{

    private Mobile mobile;

    public AppleEngineer()
    {
        mobile=new Mobile(); 
    }

    public void addCamera(){
        mobile.addCamera("Apple Camera 50MP");
    }

    public void addBattery(){
       mobile.addBattery("Apple Battery 48 hr");
    }

    public void addDisplay(){
        mobile.addDisplay("Apple Display Full HD");
    }

    public void addMotherBoard(){
        mobile.addMotherBoard("Apple Motherboard");
    }

    public void addRam(){
       mobile.addRam("Apple Ram");
    }

    public void coverBody(){
        System.out.println("Body has been Covered");
    }

    public Mobile getMobile()
    {
        return mobile;
    }


}