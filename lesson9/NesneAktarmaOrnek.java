package lesson9;

public class NesneAktarmaOrnek {
    public static void main(String[] args) {
// Nesne oluşturma
        Ogrenci ogrenci = new Ogrenci("Ahmet", 20);
// Metodu çağırma ve nesneyi parametre olarak aktarma
        degisiklikYap(ogrenci);
// Metodun çağrılmasından sonra orijinal nesnenin durumunu kontrol etme
        System.out.println("Orijinal Ogrenci Bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());
    }
    // Metot, Ogrenci nesnesini parametre olarak alır ve üzerinde değişiklik yapar
    public static void degisiklikYap(Ogrenci ogrenci) {
// Nesnenin bilgilerini değiştirme
        ogrenci.setAd("Mehmet");
        ogrenci.setYas(22);
// Değişikliklerin ardından bilgileri kontrol etme
        System.out.println("Metot İçindeki Ogrenci Bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());
    }
}

// Ogrenci sınıfı
class Ogrenci {
    private String ad;
    private int yas;
    public Ogrenci(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }
    public String getAd() {
        return ad;
    }
    public int getYas() {
        return yas;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
}
