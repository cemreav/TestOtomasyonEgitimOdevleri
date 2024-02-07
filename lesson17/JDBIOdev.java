package lesson17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.jdbi.v3.core.Jdbi;
public class JDBIOdev {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11678198";
        String kullaniciAdi = "sql11678198";
        String sifre = "wVJ6TIBGWB";

        Jdbi jdbi = Jdbi.create(jdbcUrl, kullaniciAdi, sifre);

        JDBIOdev jdbiOdev = jdbi.onDemand(VeritabaniServisi.class);

        veriServisi.ekle("tablo1", "kolon1", "kolon2");
        veriServisi.ekle("tablo2","kolon4", "kolon5");
        veriServisi.ekle("tablo3","kolon8", "kolon9");
        veriServisi.sil("tablo4","where IsSucced=0");
    }
}

public class VeriServisi{
    @SqlUpdate("INSERT INTO: tablo(:kolonlar) VALUES(:degerler)")
    void ekle (String tablo, String kolonlar, String degerler);

    @SqlUpdate("DELETE FROM :tablo WHERE :sart")
    void sil(String tablo, String sart);
}
