class OversTotalRunsScoredInterpreter implements Interpreter{

    Interpreter interpreter;

    public OversTotalRunsScoredInterpreter()
    {
        interpreter=new SumInterpreter();
    }

    public double interpret(int []arr,int start,int end)
    {
        return interpreter.interpret(arr,start-1,end-1);
    }
}