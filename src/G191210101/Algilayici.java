package G191210101;

public class Algilayici {
    private IAlgilayici algilayici;

    public Algilayici(IAlgilayici algilayici) {
        this.algilayici = algilayici;
    }
    public void algilaOlc(){
        algilayici.algilaOlc();
    }
}
