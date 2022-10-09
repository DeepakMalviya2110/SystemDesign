class Mobile implements MobileDesignPlan{
    
    String camera;
    String battery;
    String display;
    String motherBoard;
    String ram;

    public void addCamera(String camera){
        this.camera=camera;
    }

    public void addBattery(String battery){
        this.battery=battery;
    }

    public void addDisplay(String display){
        this.display=display;
    }

    public void addMotherBoard(String mb){
        this.motherBoard=mb;
    }

    public void addRam(String ram){
       this.ram=ram;
    }

    public void coverBody(){
        System.out.println("Body has been Covered");
    }
    
}