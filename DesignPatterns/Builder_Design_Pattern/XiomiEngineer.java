class XiomiEngineer implements Engineer{

    private Mobile mobile;

    public XiomiEngineer()
    {
        mobile=new Mobile(); 
    }

    public void addCamera(){
        mobile.addCamera("Xiomi Camera 5MP");
    }

    public void addBattery(){
       mobile.addBattery("Xiomi Battery 12 hr");
    }

    public void addDisplay(){
        mobile.addDisplay("Xiomi Display HD");
    }

    public void addMotherBoard(){
        mobile.addMotherBoard("Xiomi Motherboard");
    }

    public void addRam(){
       mobile.addRam("Xiomi Ram");
    }

    public void coverBody(){
        System.out.println("Body has been Covered");
    }

    public Mobile getMobile()
    {
        return mobile;
    }

}