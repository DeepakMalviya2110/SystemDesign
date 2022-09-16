public class Handler{

    public static void main(String []args)
    {
         
         Handler1 o1=new Handler1();
         Handler2 o2=new Handler2(o1);
         Handler3 o3=new Handler3(o2);

         StateValue st=new StateValue(10);
    }
}