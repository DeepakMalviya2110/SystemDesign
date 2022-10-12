class Circle implements Shape{

    int x;
    int rad;

    public Circle()
    {
        //fetching x and rad from database, which is costly.
    }

    public Circle(int x,int rad)
    {
        this.x=x;
        this.rad=rad;
    }

    public Shape clone(){
        return new Circle(this.x,this.rad);
    }  

}