class DoctorFactory{

    DoctorAbstractFactory df;
    Doctor d;

    public DoctorFactory(DoctorAbstractFactory df)
    {
        d=df.createDoctor();
    }

    public Doctor getDoctor()
    {
        return d;
    }
}