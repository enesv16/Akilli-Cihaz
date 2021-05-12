package G191210101;

import java.sql.*;

public class VeritabaniIslem {



    static Connection baglan() {

        Connection connect = null;

        try {
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/G191210101",
                    "postgres", "121663");
            if (connect == null) {
                System.out.println("Veritabanıyla Bağlantı Kurulamadı...Tekrar Deneyiniz!");
            }
            else{
                System.out.println("Veritabanına Bağlanılıyor...");
                Thread.sleep(500);
                System.out.println("Veritabanına Bağlanıldı!");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connect;
    }

    public boolean girisYap(String kAdi, String sifre) {
        try {
            boolean girisDurumu ;
            boolean yetkiDurumu = true;

            Connection conn = this.baglan();

            String sql = "SELECT *  FROM \"kullanicilar\" WHERE \"kullaniciAdi\"='" + kAdi + "' and \"sifre\"='" + sifre + "' and \"yetki\"='"+ yetkiDurumu + "'";

            Statement stmnt = conn.createStatement();
            ResultSet sonuc = stmnt.executeQuery(sql);


            conn.close();

            Thread.sleep(800);
            if (!sonuc.next()) {
                System.out.println("Kullanıcı kayıtlı değil ya da yetkisi yok!..");
                System.out.println("Lütfen kullanıcı adı ve şifrenizi kontrol ettikten sonra tekrar deneyiniz.");
                girisDurumu = false;
            } else {
                System.out.println("Kullanıcı Girişi Başarılı!..");

                girisDurumu = true;
            }


            sonuc.close();
            stmnt.close();
            return girisDurumu;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
