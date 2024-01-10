package lesson9;

public class HesapMakinesi {
    // Toplama işlemi yapan metotun dönüş tipi int
    public int topla(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        return sonuc; // int tipinde değer döndürülüyor
    }
    // Çıkarma işlemi yapan metotun dönüş tipi double
    public double cikar(double sayi1, double sayi2) {
        double sonuc = sayi1 - sayi2;
        return sonuc; // double tipinde değer döndürülüyor
    }
    // Üç tam sayıyı toplayan metot
    public int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
// Toplama işlemi sonucu int tipinde
        int toplamaSonucu = hesapMakinesi.topla(5, 3);
        System.out.println("Toplama Sonucu: " + toplamaSonucu);
// Çıkarma işlemi sonucu double tipinde
        double cikarmaSonucu = hesapMakinesi.cikar(10.5, 3.2);
        System.out.println("Çıkarma Sonucu: " + cikarmaSonucu);
        // Üç tam sayı toplama
        System.out.println("Toplam: " + hesapMakinesi.topla(2, 4, 6));
    }
}
