package lesson11;

public interface Sekil3 {
    double alanHesapla();
    double cevreHesapla();

    public class Dikdortgen implements Sekil3{
        private double en;
        private double boy;

        public  Dikdortgen (double en, double boy){
            this.en=en;
            this.boy=boy;
        }
        @Override
        public double alanHesapla(){
            return en*boy;
        }
        @Override
        public double cevreHesapla(){
            return 2*(en+boy);
        }
    }

    public class Kare implements Sekil3{
        private double kenar;
        public Kare(double kenar){
            this.kenar=kenar;
        }
        @Override
        public double alanHesapla(){
            return kenar * kenar;
        }
        @Override
        public double cevreHesapla(){
            return 4 * kenar;
        }
    }
}

