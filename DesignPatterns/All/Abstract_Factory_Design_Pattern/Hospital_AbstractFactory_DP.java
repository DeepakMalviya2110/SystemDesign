class Hospital_AbstractFactory_DP{    

    public static void main(String []args)
    {
        DoctorFactory df=new DoctorFactory(new Cardiologist());
        Doctor d=df.getDoctor();
        System.out.println(d.speciality()+" "+d.DoctorName()+", Fees: "+d.fees()+" with experience of "+d.experience()+" years");

        DoctorFactory df2=new DoctorFactory(new Dermatologist());
        d=df2.getDoctor();
        System.out.println(d.speciality()+" "+d.DoctorName()+", Fees: "+d.fees()+" with experience of "+d.experience()+" years");
    }

}