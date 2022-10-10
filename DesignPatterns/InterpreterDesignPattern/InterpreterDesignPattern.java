class InterpreterDesignPattern{
    public static void main(String []args)
    {
        int []arr=new int[20];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*20);
        }
        Interpreter interpreter=new OversRunRateInterpreter();
        System.out.println("Runrate in first six overs: "+interpreter.interpret(arr,1,6));
        System.out.println("Runrate in mid overs: "+interpreter.interpret(arr,7,15));
        System.out.println("Runrate in death overs: "+interpreter.interpret(arr,16,20));

        Interpreter interpreter2=new OversTotalRunsScoredInterpreter();
        System.out.println("Runs in first six overs: "+interpreter2.interpret(arr,1,6));
        System.out.println("Runs in mid overs: "+interpreter2.interpret(arr,7,15));
        System.out.println("Runs in death overs: "+interpreter2.interpret(arr,16,20));
    }
}