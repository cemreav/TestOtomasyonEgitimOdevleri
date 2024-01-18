package lesson11;
public class VeriSaklayici {
    private int gizliSayi;

    public int getGizliSayi(){
        return gizliSayi;
    }

    public void setGizliSayi(int yeniDeger){
        this.gizliSayi=yeniDeger;
    }

    public class Hesaplama{
        private int topla(int sayi1, int sayi2){
            return sayi1 + sayi2;
        }

        public int hesaplaToplam(int x, int y){
            return topla(x, y);
        }
    }

    public class Ogrenci{
        private String isim;

        public void setIsim(String isim){
            this.isim=isim;
        }
    }

    public class Araba {
        private String marka;

        public void setMarka(String marka){
            this.marka=marka;
        }

        public void yazdirMarka(){
            System.out.println("Marka: "+this.marka);
        }
    }

    public class Sayi{
        private int deger;
        public Sayi(){
            this(0);
        }
        public Sayi(int deger){
            this.deger=deger;
        }
    }
}


