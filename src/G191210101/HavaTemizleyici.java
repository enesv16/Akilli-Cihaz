package G191210101;

import static java.lang.Thread.sleep;

public class HavaTemizleyici implements IEyleyiciAnahtar {
    private String havaTemizleyiciDurum = "Kapalı";

    @Override
    public void ac()  {
        if(havaTemizleyiciDurum == "Kapalı"){
            System.out.println("Hava Temizleyici Açılıyor..");
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            havaTemizleyiciDurum = "Açık";
            System.out.println("Hava Temizleyici Durumu: "+havaTemizleyiciDurum);
        }else{
            System.out.println("Hava Temizleyici zaten açık Başka bir işlem deneyin!");
        }

    }

    @Override
    public void kapat() {
        if(havaTemizleyiciDurum == "Açık"){
            System.out.println("Hava Temizleyici Kapatılıyor..");
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            havaTemizleyiciDurum = "Kapalı";
            System.out.println("Hava Temizleyici Durumu: "+havaTemizleyiciDurum);
        }else{
            System.out.println("Hava Temizleyici zaten kapalı Başka bir işlem deneyin!");
        }

    }
}
