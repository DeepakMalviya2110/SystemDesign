import java.util.*;
class NetflixProxy implements Proxy{

    List<String> authorisedUsers;
    NetflixSubscription subscription;

    public NetflixProxy()
    {
        subscription=new NetflixSubscription();
        authorisedUsers=new ArrayList<>();
    }

    public void subscribe(User user)
    {
        authorisedUsers.add(user.name);
    }

    public void watchMovie(User user)
    {
        if(!authorisedUsers.contains(user.name))
        {
            System.out.println("Access Denied!!");
            System.out.println("You don't have the required subscription to watch this movie!!");
            return;
        }

        subscription.watchMovie(user);
    }



}