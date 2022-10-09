class ChangeOfResponsibilityDesignPattern{

    public static void main(String []args)
    {
        Handler h1=new T20Team();
        Handler h2=new ODITeam();
        Handler h3=new TestTeam();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        h1.handle(51);
    }

}