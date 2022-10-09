class ODITeam implements Handler{

    Handler next;

    public void setSuccessor(Handler next){
        this.next=next;
    }

    public void handle(int overs){
        if(overs>25&&overs<=50)
        {
            System.out.println("ODI Team: Rohit Sharma,KL Rahul,Virat Kohli, Surya, Hardik, Rishan Pant, Jadeja, Harshal, Bhuvi, Yuzi, Bumrah");
        }
        else{
            this.next.handle(overs);
        }
    }
}