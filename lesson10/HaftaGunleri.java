package lesson10;

public enum HaftaGunleri {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int gunNo;

    //Constructor
    HaftaGunleri(int gunNo){
        this.gunNo=gunNo;
    }
    public int getGunNo(){
        return gunNo;
    }

    public String isHaftaIci(){
        if (gunNo >=1 && gunNo<=5){
            return "Hafta içi";
        }else {
            return "Hafta sonu";
        }
    }

    public class EnumSinifYapisi{
        public static void main (String[] args){
            HaftaGunleri bugun = HaftaGunleri.CUMARTESI;

            // ENUM değerine göre bazı metotları kullanma
            System.out.println("Gün numarası: "+ bugun.getGunNo());
            System.out.println("Günün durumu: "+bugun.isHaftaIci());
        }

    }
}


