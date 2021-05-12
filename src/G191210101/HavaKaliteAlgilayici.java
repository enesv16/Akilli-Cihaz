package G191210101;
import java.util.*;
public class HavaKaliteAlgilayici implements IAlgilayici {

    private int havaKaliteIndeksi;
    Random rastgele = new Random();

    public void havaKaliteOlc(){
       havaKaliteIndeksi = rastgele.nextInt(300);
       if(havaKaliteIndeksi<50){
           System.out.println("Hava Kalite İndeksi: "+havaKaliteIndeksi+"-> Hava Kalitesi İyi");
       }else if(havaKaliteIndeksi<100){
           System.out.println("Hava Kalite İndeksi: "+havaKaliteIndeksi+"-> Hava Kalitesi Orta");
       }else if(havaKaliteIndeksi<300){
           System.out.println("Hava Kalite İndeksi: "+havaKaliteIndeksi+"-> Hava Kalitesi Sağlıksız ");
           System.out.println("Hava Temizleyici'nin çalıştırılması önerilir");
       }
    }

    public int getHavaKaliteIndeksi() {
        return havaKaliteIndeksi;
    }

    @Override
    public void algilaOlc() {
        havaKaliteOlc();
    }
}
