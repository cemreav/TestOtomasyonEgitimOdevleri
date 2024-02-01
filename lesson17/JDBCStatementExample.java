package lesson17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCStatementExample {
    public static <Sorgu> void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/veritabani_adi";
        String kullaniciAdi = "kullanici_adi";
        String sifre = "sifre";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            statement = connection.createStatement();
            String sqlSorgusu = "SELECT * FROM tablo_adi WHERE sart = 'deger'";
            resultSet = statement.executeQuery(sqlSorgusu);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("ad");
// ... Diğer sütunların alınması
                System.out.println("ID: " + id + ", Ad: " + ad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
