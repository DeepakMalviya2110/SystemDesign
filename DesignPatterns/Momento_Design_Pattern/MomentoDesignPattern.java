class MomentoDesignPattern{

    public static void main(String []args)
    {
        Background background=new Background(); //White
        Momento momento=new Momento();  //version
        momento.saveMomento(background);  
        background.setBackgroundColor(new YellowColor());
        background.setBackgroundColor(new BlackColor());
        momento.saveMomento(background);
        background.setBackgroundColor(new RedColor());
        momento.saveMomento(background);


        Color color=momento.getMomento(2);
        System.out.println(color.color());
    }

}