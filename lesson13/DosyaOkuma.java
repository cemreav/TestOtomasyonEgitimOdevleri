/*package lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosyaOkuma {
    try(FileInputStream fis = new FileInputStream(("dosya.txt"))){
        int veri;
        while ((veri=fis.read()) !=-1){
            System.out.println((char) veri);
        }
    }catch(IOException e){
        e.printStackTrace();
    }

    try (FileOutputStream fos = new FileOutputStream("yeni_dosya.txt")) {
        String veri = "Bu dosyaya yazılan metin.";
        byte[] bytes = veri.getBytes(); // Veriyi byte dizisine dönüştür
        fos.write(bytes); // Byte dizisini dosyaya yaz
        System.out.println("Dosya yazıldı.");
    }catch (IOException e) {
        e.printStackTrace();
    }
    public DosyaOkuma() throws FileNotFoundException, IOException {
    }
}
*/