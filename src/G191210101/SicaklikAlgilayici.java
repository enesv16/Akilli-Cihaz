package G191210101;
import java.util.*;
public class SicaklikAlgilayici implements IAlgilayici {

    private int sicaklik;
    Random rastgele = new Random();

    public void sicaklıkOlc(){
        sicaklik= rastgele.nextInt(50);
        if(sicaklik>23){
            System.out.println("Sıcaklık: "+sicaklik+" Santigrat derece");
            System.out.println("Soğutucu'nun açılması önerilir.");
        }else{
            System.out.println("Sıcaklık: "+sicaklik+" Santigrat derece");
        }

    }


    @Override
    public void algilaOlc() {
        sicaklıkOlc();
    }
}
