package lesson10;

public class EnumOrnek {
    public enum Gunler{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
    }
    public static void main (String[] args){
        //ENUM sabitlerine erişim
        System.out.println("Bugün günlerden: "+ Gunler.CUMARTESI);

        //Tüm ENUM sabitlerini döngüyle alma
        for (Gunler gun : Gunler.values()){
            System.out.println(gun);
        }

        //ENUM'dam bir sabit değeri elde etme
        Gunler secilenGun = Gunler.valueOf("CUMA");
        System.out.println("Seçilen gün "+ secilenGun);
    }
}
