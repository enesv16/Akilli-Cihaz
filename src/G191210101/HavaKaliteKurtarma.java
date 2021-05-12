package G191210101;

public class HavaKaliteKurtarma implements IObserver{

    MerkezIslemBirimi havaislem = new MerkezIslemBirimi();
    HavaKaliteAlgilayici havakalitealg= new HavaKaliteAlgilayici();


    @Override
    public void update() {
        havaislem.havaKaliteGoruntule();
        if(havakalitealg.getHavaKaliteIndeksi()>100){
            System.out.println("Hava Kalite Kurtarma devreye giriyor");
            havaislem.havaTemizleyiciAc();
        }

    }
}
