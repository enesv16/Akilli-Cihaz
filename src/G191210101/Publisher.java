package G191210101;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject{
    private List<IObserver> kullanicilar = new ArrayList<>();
    @Override
    public void attach(IObserver user) {
        kullanicilar.add(user);
    }
    @Override
    public void detach(IObserver user) {
        kullanicilar.remove(user);
    }

    @Override
    public void update() {
        System.out.println("Hava Kalite Kurtarma sokuluyor.");
        for(IObserver _kullanici: kullanicilar) {
            _kullanici.update();
        }

    }

}
