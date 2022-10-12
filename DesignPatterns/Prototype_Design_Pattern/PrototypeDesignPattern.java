class PrototypeDesignPattern{

    public static void main(String []args)
    {
        Circle c1=new Circle();
        Circle c2=(Circle)c1.clone();

        System.out.println(c1.x);
        System.out.println(c2.x);
        c2.x=20;
        System.out.println(c1.x);
        System.out.println(c2.x);
    }

}