package lesson11;

import javax.swing.table.TableRowSorter;

public class Sekil2 {
    private int x;
    private int y;
    public Sekil2(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void yazdirPozsyon(){
        System.out.println("Pozisyon:("+x+","+y+")");
    }
    public class Dikdortgen extends Sekil2{
        private int en;
        private int boy;
        public Dikdortgen(int x, int y, int en, int boy){
            super(x,y);
            this.en=en;
            this.boy=boy;
        }
        public void alanHesapla(){
            int alan =en*boy;
            System.out.println("Alan: "+alan);
        }
    }

    abstract class Sekil3{
        abstract void cevreHesapla();
        abstract void alanHesapla();
        public void yazdir(){
            System.out.println("Bu bir şekildir.");
        }
    }

    class Dikdortgen1 extends Sekil3{
        private int en;
        private int boy;

        public Dikdortgen1(int en, int boy){
            this.en=en;
            this.boy=boy;
        }
         @Override
        void cevreHesapla(){
            int cevre =2*(en+boy);
            System.out.println("Dikdörtgen çevresi: "+cevre);
         }
         @Override
        void alanHesapla(){
            int alan= en*boy;
            System.out.println("Dikdörtgenin alanı: "+ alan);
         }
    }

}
