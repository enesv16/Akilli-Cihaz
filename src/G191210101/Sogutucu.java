package G191210101;

import static java.lang.Thread.sleep;

public class Sogutucu implements IEyleyiciAnahtar {


    public String  sogutucuDurumu = "Kapalı";


    @Override
    public void ac() {
        if(sogutucuDurumu == "Kapalı"){
            System.out.println("Soğutucu Açılıyor..");
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sogutucuDurumu = "Açık";
            System.out.println("Soğutucu Durumu: "+sogutucuDurumu);
        }else{
            System.out.println("Soğutucu zaten açık Başka bir işlem deneyin");
        }

    }

    @Override
    public void kapat()  {
        if(sogutucuDurumu == "Açık"){
            System.out.println("Soğutucu Kapatılıyor..");
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sogutucuDurumu = "Kapalı";
            System.out.println("Soğutucu Durumu: "+sogutucuDurumu);
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Soğutucu zaten kapalı Başka bir işlem deneyin");
        }
    }

}
