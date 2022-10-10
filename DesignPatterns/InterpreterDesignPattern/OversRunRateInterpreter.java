class OversRunRateInterpreter implements Interpreter{

    Interpreter interpreter;

    public OversRunRateInterpreter()
    {
        interpreter=new AverageInterpreter();
    }

    public double interpret(int []arr,int start,int end)
    {
        return interpreter.interpret(arr,start-1,end-1);
    }
}