class SumInterpreter implements Interpreter{

    public double interpret(int []arr,int start,int end)
    {
        if(start<0||start>=arr.length||end<0||end>=arr.length||start>end)
        {
            System.out.println("Invalid Input");
            return -1;
        }

        int sum=0;
        for(int i=start;i<=end;i++)
        {
            sum+=arr[i];
        }

        return sum;
    }
}