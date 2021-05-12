package G191210101;

public class Eyleyici {
    private IEyleyiciAnahtar anahtar;

    public Eyleyici(IEyleyiciAnahtar anahtar) {
        this.anahtar = anahtar;
    }

    public void ac() {
        anahtar.ac();
    }

    public void kapat() {
        anahtar.kapat();
    }


}
