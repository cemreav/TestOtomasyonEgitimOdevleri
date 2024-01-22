package lesson12;

// Örnek sınıf: ErrorExample
public class ErrorExample {
    public static int divideCheck(int numerator, int denominator) throws IllegalAccessException, ArithmeticException{
        // Giriş parametre kontrolü
        if (denominator==0){
            throw new IllegalAccessException("Payda sıfır olamaz");
        }
        // İşlem yap ve sonucu döndür
        try {
            return numerator/denominator;
        }catch (ArithmeticException e){
            // ArithmeticException durumu
            throw new ArithmeticException("Hatadan dolayı işlem gerçekleştirilemedi.");
        }
    }
}
// Test sınıfı: ErrorExampleTest
class ErrorExampleTest{
    public static void main(String[] args){
        // Senaryo 1: Geçerli durum
        try {
            int result = ErrorExample.divideCheck(20, 4);
            System.out.println("Sonuç: "+result);
        }catch (IllegalAccessException|ArithmeticException e){
            System.err.println("Hata: "+e.getMessage());
        }
        // Senaryo 2: Payda sıfır
        try {
            int result = ErrorExample.divideCheck(4,0);
            System.out.println("Sonuç: "+result);
        }catch (IllegalAccessException|ArithmeticException e){
            System.err.println("Hata: "+e.getMessage());
        }
        // Senaryo 3: Aritmetik hataya yol açan durum
        try{
            int result=ErrorExample.divideCheck(8,0);
            System.out.println("Sonuç: "+result);
        }catch (IllegalAccessException|ArithmeticException e){
            System.err.println("Hata: "+ e.getMessage());
        }
    }
}
