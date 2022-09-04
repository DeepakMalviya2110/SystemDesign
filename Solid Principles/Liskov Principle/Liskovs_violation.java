//Child should do work of Parent

import java.util.*;
 class Liskov{

public static class Parents{

         public void attendance()
        {
            System.out.println("I am the Parent");
        }
}

public static class Child extends Parents{
        public void attendance()
        {
            System.out.println("My Parents are busy, can I come?");    //this is violation as Child is not a parent
        }
}

public static class Father extends Parents{
        public void attendance()
        {
            System.out.println("I am the father");
        }
}

public static class Mother extends Parents{

     public void attendance()
        {
            System.out.println("I am the mother");
        }

}


public static void main(String []args)
{
    ArrayList<Parents> parentsMeeting=new ArrayList<>();

    parentsMeeting.add(new Father());

    parentsMeeting.add(new Mother());

    parentsMeeting.add(new Mother());

    parentsMeeting.add(new Child()); // here we have added mother and father in the list of parent

    for(Parents p:parentsMeeting)
    {
        p.attendance();    //even child can go in the parents meeting instead of child
    }

}

}