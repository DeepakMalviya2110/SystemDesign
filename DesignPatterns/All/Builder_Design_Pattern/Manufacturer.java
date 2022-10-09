class Manufacturer{
    private Engineer engineer;

    public Manufacturer(Engineer engineer)
    {
        this.engineer=engineer;
    }

    public Mobile getMobile()
    {
        return this.engineer.getMobile();
    }

    public void constructMobile()
    {
        this.engineer.addMotherBoard();
        this.engineer.addCamera();
        this.engineer.addDisplay();
        this.engineer.addRam();
        this.engineer.addBattery();
    }

}