package G191210101;

import java.util.Scanner;


public class AgArayuzu {

    public static void main(String[] args) throws InterruptedException  {
        MerkezIslemBirimi islemci = new MerkezIslemBirimi();
        VeritabaniIslem giris = new VeritabaniIslem();
        Publisher publisher = new Publisher();
        Scanner reader = new Scanner(System.in);
        String kullaniciadi;
        String sifre;
        while(true) {
            System.out.println("     --> ***Kullanici Girisi*** <--     ");
            System.out.println("Kullanici Adinizi Giriniz --> ");
            kullaniciadi = reader.next();
            System.out.println("Sifrenizi Giriniz -->");
            sifre = reader.next();
            if(giris.girisYap(kullaniciadi,sifre)) {
                System.out.println("Lütfen Bekleyiniz! Akilli cihaz arayüzüne bağlanılıyor...");
                Thread.sleep(1700);
                break;
            }
        }
        Kullanici kullanıcı1 = new Kullanici.KullaniciBuilder(kullaniciadi,sifre,true)
                .universite("Sakarya Universitesi")
                .build();
        publisher.attach(kullanıcı1);
        publisher.update();
    int secim;

        do{


            Thread.sleep(500);
            System.out.println("  --> ***Akıllı Cihaz Menüsü*** <--  ");
            System.out.println("1 --> Sicaklik Goruntule");
            System.out.println("2 --> Hava Kalitesini Olç");
            System.out.println("3 --> Sogutucuyu Ac");
            System.out.println("4 --> Sogutucuyu Kapat");
            System.out.println("5 --> Hava Temizleyici Ac");
            System.out.println("6 --> Hava Temizleyici Kapat");
            System.out.println("7 --> Akıllı Cihazdan Çık");
            System.out.print("Secim:");
            secim = reader.nextInt();

            switch(secim){
                case 1:
                    islemci.sicaklikGoruntule();
                    break;
                case 2:
                    islemci.havaKaliteGoruntule();
                    break;
                case 3:
                    islemci.sogutucuAc();
                    break;
                case 4:
                    islemci.sogutucuKapat();
                    break;
                case 5:
                    islemci.havaTemizleyiciAc();
                    break;
                case 6:
                    islemci.havaTemizleyiciKapat();
                    break;
                case 7:

                    break;
                default:

                    break;

            }
        }while(secim != 7);




    }

}
