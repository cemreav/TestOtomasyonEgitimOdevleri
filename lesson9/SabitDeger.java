package lesson9;

public class SabitDeger {
    public static final double PI= 3.14159;
    public static final int MAX_SAYI=100;

    public static void main (String[] args){
        double yaricap=5.0;
        double alan =PI *  yaricap * yaricap;
        System.out.println("Dairenin alanı: "+alan);

        int sayi=75;
        if (sayi > MAX_SAYI){
            System.out.println("Sayı "+MAX_SAYI+" 'den büyük.");
        }
        else {
            System.out.println("Sayı "+MAX_SAYI+" 'den küçük.");
        }
    }
}
