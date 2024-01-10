package lesson9;

public class ConstructorsAraba {
    // Yapıcı metot
    public ConstructorsAraba() {
        System.out.println("Yapıcı metot çağrıldı: Araba nesnesi oluşturuldu");
    }
    // Başka bir yapıcı metot örneği
    public ConstructorsAraba(String model, int yil) {
        System.out.println("Yapıcı metot çağrıldı: Araba nesnesi özel parametrelerle oluşturuldu");
        this.model = model;
        this.yil = yil;
    }
    // Sınıfın diğer kısımları
    private String model;
    private int yil;
    // Getter ve setter metotları (diğer metotlar)
    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }
    public int getYil() {
        return yil;
    }
    public void setYil(int yil) {
        this.yil = yil;
    }
    public static void main(String[] args) {
// Araba sınıfından bir nesne oluşturulduğunda yapıcı metot çağrılır
        ConstructorsAraba araba1 = new ConstructorsAraba();
// Parametreli yapıcı metot çağrısı
        ConstructorsAraba araba2 = new ConstructorsAraba("Toyota", 2022);
// Getter kullanarak değerlere erişim
        System.out.println("Araba Modeli: " + araba2.getModel());
        System.out.println("Üretim Yılı: " + araba2.getYil());
    }
}
