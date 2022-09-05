class SingleObjectClass{

    static SingleObjectClass instance;

    private SingleObjectClass()
    {
    }

    //In case of multithreading, multiple objects can be created, so, if we use synchronized, second thread only enters one first thread got out of method.
    public static synchronized SingleObjectClass getSingleObjectInstance()  
    {
        if(instance==null)
        {
            instance=new SingleObjectClass();
        }

        return instance;
    }

    public void info()
    {
        System.out.println("This is Singleton Design Pattern, this does not allow us to have more than one object creation");
    }

}