package lesson9;

public class StatikMetotOrnek {
    // Statik bir metot tanımlama
    public static void staticMetot() {
        System.out.println("Bu bir statik metottur.");
    }
    // Statik olmayan bir metot tanımlama
    public void nonStaticMetot() {
        System.out.println("Bu bir statik olmayan metottur.");
    }
    public static void main(String[] args) {
// Statik metot çağrısı
        StatikMetotOrnek.staticMetot();
// Statik olmayan metot çağrısı için önce sınıfın bir nesnesi oluşturulmalıdır.
        StatikMetotOrnek ornekNesne = new StatikMetotOrnek();
        ornekNesne.nonStaticMetot();
    }
}
