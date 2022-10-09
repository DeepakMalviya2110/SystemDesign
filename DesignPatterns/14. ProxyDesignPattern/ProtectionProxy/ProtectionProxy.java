class ProtectionProxy{

    public static void main(String []args)
    {
        Proxy proxy=new NetflixProxy();
        User user=new User("Deepak");

        proxy.watchMovie(user);

        proxy.subscribe(user);

        proxy.watchMovie(user);


    }

}