package lesson12;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReadingExample {
    public static void main(String[] args){
        String dosyaYolu="dosya.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader((new FileReader(dosyaYolu)));
            String satir;
            while ((satir=bufferedReader.readLine())!=null){
                System.out.println(satir);
            }
            bufferedReader.close();
        }catch (FileNotFoundException ex){
            System.out.println("Dosya bulunamadı: "+ex.getMessage());
        }catch (IOException ex){
            System.out.println("Dosya okuma hatası: "+ex.getMessage());
        }finally {
            System.out.println("Dosya okuma işlemi tamamlandı.");
        }
    }
}
