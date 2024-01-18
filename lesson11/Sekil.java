package lesson11;

public abstract class Sekil {
    abstract void cevreHesapla();
    abstract void alanHesapla();
    public void yazdir(){
        System.out.println("Bu bir şekildir.");
    }

    public class Dikdortgen extends Sekil{
        private int en;
        private int boy;

        public Dikdortgen(int en, int boy){
            this.en=en;
            this.boy=boy;
        }

        @Override
        void cevreHesapla(){
            int cevre=2*(en +boy);
            System.out.println("Diktörtgenin çevresi: "+ cevre);
        }
        @Override
        void alanHesapla(){
            int alan= en * boy;
            System.out.println("Dikdörtgenin alanı: "+ alan);
        }
    }

    public interface Veritabani{
        void baglan();
        void sorguYap(String sorgu);
        void baglantiKapat();

        String DATABASE_NAME= "db_veritabani";
        int PORT=3306;
    }
    public class MySQLVeritabani implements Veritabani{
        @Override
        public void baglan(){}
        @Override
        public void sorguYap(String sorgu){}
        @Override
        public void baglantiKapat(){}
    }
}
