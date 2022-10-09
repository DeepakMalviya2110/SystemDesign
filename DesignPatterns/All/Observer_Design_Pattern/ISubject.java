interface ISubject{

    public void addObserver(IObserver o);

    public void removeObserver(IObserver o);

    public void notifyObservers();

}