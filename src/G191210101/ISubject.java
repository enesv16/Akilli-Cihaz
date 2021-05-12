package G191210101;

public interface ISubject {

    void attach(IObserver user);
    void detach(IObserver user);
    void update();

}
