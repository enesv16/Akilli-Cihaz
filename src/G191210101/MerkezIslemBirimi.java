package G191210101;

public class MerkezIslemBirimi {
    IEyleyiciAnahtar sogutucuAnahtar = new Sogutucu();
    IEyleyiciAnahtar havaTemizleyiciAnahtar = new HavaTemizleyici();
    IAlgilayici sicaklikAlg = new SicaklikAlgilayici();
    IAlgilayici havaKaliteAlg = new HavaKaliteAlgilayici();
    Algilayici sicaklik = new Algilayici(sicaklikAlg);
    Algilayici havaKalite = new Algilayici(havaKaliteAlg);
    Eyleyici sogutucuEyleyici= new Eyleyici(sogutucuAnahtar);
    Eyleyici havaTemizlemeEyleyici= new Eyleyici(havaTemizleyiciAnahtar);

    public void havaKaliteGoruntule(){
        havaKalite.algilaOlc();
    }
    public void sicaklikGoruntule(){
        sicaklik.algilaOlc();
    }
    public void sogutucuAc(){ sogutucuEyleyici.ac(); }
    public void sogutucuKapat(){ sogutucuEyleyici.kapat(); }
    public void havaTemizleyiciAc(){
        havaTemizlemeEyleyici.ac();
    }
    public void havaTemizleyiciKapat(){
        havaTemizlemeEyleyici.kapat();
    }
}
