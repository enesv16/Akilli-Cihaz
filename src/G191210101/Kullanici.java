package G191210101;

public class Kullanici implements IObserver {
    private String kullaniciAdi;
    private String sifre;
    private String universite;
    private boolean yetki;

    public Kullanici(KullaniciBuilder kBuilder){
        this.kullaniciAdi = kBuilder.kullaniciAdi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public boolean isYetki() {
        return yetki;
    }

    public String getUniversite() {
        return universite;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "kullaniciAdi='" + kullaniciAdi + '\'' +
                ", sifre='" + sifre + '\'' +
                ", universite='" + universite + '\'' +
                ", yetki=" + yetki +
                '}';
    }

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


    public static class KullaniciBuilder{
        private String kullaniciAdi;
        private String sifre;
        private String universite;
        private boolean yetki;
        public KullaniciBuilder(String kullaniciAdi, String sifre, boolean yetki) {
            this.kullaniciAdi= kullaniciAdi;
            this.sifre=sifre;
            this.yetki=yetki;
        }

        public KullaniciBuilder universite(String universite){
            this.universite = universite;
            return this;
        }
        public Kullanici build() {
            Kullanici kullanici = new Kullanici(this);
            return kullanici;
        }
    }
}

