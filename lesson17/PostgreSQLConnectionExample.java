package lesson17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PostgreSQLConnectionExample {
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/veritabani_adi";
        String kullaniciAdi = "kullanici_adi";
        String sifre = "sifre";
        try{
            Connection connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            if (connection != null){
                System.out.println("PostgreSQL veritabanına bağlantı başarılı!");
                // Veritabanı işlemleri burada yapılabilir.
                connection.close();
            }
        }catch (SQLException e){
            System.out.println("Bağlantı hatası: "+e.getMessage());
        }
    }
}
