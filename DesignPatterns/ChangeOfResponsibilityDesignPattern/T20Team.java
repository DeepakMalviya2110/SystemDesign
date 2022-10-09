class T20Team implements Handler{

    Handler next;

    public void setSuccessor(Handler next){
        this.next=next;
    }

    public void handle(int overs){
        if(overs<=25)
        {
            System.out.println("T20I team: Rohit Sharma,KL Rahul,Virat Kohli, Surya, Hardik, Dinesh Kartik, Jadeja, Harshal, Bhuvi, Yuzi, Bumrah");
        }
        else{
            this.next.handle(overs);
        }
    }
}