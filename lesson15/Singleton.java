package lesson15;

public class Singleton {
    private static Singleton instance;
    // Constructor private olarak tanımlanır, böylece dışarıdan yeni bir örnek oluşturulamaz
    private Singleton(){
        // Constructor içeriği
    }
    // Singleton örneğine erişim sağlayan metot
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

