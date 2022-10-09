class BuilderDesignPattern{
    public static void main(String []args)
    {
        Engineer engineer=new XiomiEngineer();
        Manufacturer man=new Manufacturer(engineer);
        man.constructMobile();
        Mobile mobile=man.getMobile();
        System.out.println("Mobile Designed: "+mobile);
        System.out.println("Ram "+mobile.ram);
        System.out.println("Camera: "+mobile.camera);
    }
}