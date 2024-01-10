package lesson10;

import static lesson10.Hafta.PAZAR;

enum Hafta{
    PAZAR,
    SALI,
    CARSAMBA,
    PERSEMBE,
    CUMA,
    CUMARTESI
}

public class HaftaKontrol {
    public static void main (String[] args) {
        Hafta gün = Hafta.PAZAR;
    switch (gün) {
        case PAZAR:
           System.out.println("Bugün pazar.");
           break;
        case SALI:
            System.out.println("Bugün salı.");
            break;
        case CARSAMBA:
            System.out.println("Bugün çarşamba.");
            break;
        case PERSEMBE:
            System.out.println("Bugün perşembe.");
            break;
        case CUMA:
            System.out.println("Bugün cuma.");
            break;
        case CUMARTESI:
            System.out.println("Bugün cumartesi.");
        }
    }
}
