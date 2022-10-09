class TestTeam implements Handler{

    Handler next;

    public void setSuccessor(Handler next){
        this.next=next;
    }

    public void handle(int overs){
        if(overs>50)
        {
            System.out.println("Test Team: Rohit Sharma,KL Rahul,Pujara, Virat Kohli, Pant,Surya, Jadeja,Ashwin,Shami,Siraj,Bumrah");
        }
        else{
            this.next.handle(overs);
        }
    }
}