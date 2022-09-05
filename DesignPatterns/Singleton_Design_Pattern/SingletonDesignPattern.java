class SingletonDesignPattern{

    public static void main(String []args)
    {
      //  SingleObjectClass obj=new SingleObjectClass();  --> This will throw error

        SingleObjectClass obj=SingleObjectClass.getSingleObjectInstance();

        obj.info();

    }

}