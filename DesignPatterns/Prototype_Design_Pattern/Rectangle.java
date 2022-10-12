class Rectangle implements Shape{

    int x;
    int y;

    public Rectangle()
    {
        //fetching x and rad from database, which is costly.
    }

    public Rectangle(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public Shape clone(){
        return new Rectangle(this.x,this.y);
    }

}