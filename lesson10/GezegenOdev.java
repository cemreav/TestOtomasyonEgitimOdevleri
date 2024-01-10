package lesson10;


public class GezegenOdev{
    public static void main (String[] args){
        for (Gezegen gezegen: Gezegen.values()){
            System.out.println("Gezegen: "+gezegen.name());
            System.out.println("Sıra numarası: "+gezegen.getSiraNo());
            System.out.println("Uzaklık: "+gezegen.getUzaklik()+" milyon km");
            System.out.println("Yarıçapı: "+gezegen.getYaricap()+" km");
            System.out.println("Dönme süresi: "+gezegen.getDonmesuresi()+" gün");
            System.out.println();
        }
    }

    public enum Gezegen {
        MERKUR(1, 57, 2439, 58),
        VENUS(2, 110, 6051,116),
        DUNYA(3, 148, 6371, 1),
        MARS(4, 230, 3389, 2),
        JUPITER(5, 780, 69911, 3),
        SATURN(6, 1438, 58232, 4),
        URANUS(7, 2970, 25362, 5),
        NEPTUN(8, 4495, 24622, 6);

        private int siraNo;
        private int uzaklik; // milyon km cinsinden
        private int yaricap; // km cinsinden
        private int donmesuresi;  // gün cinsinden

        Gezegen(int siraNo, int uzaklik, int yaricap, int donmesuresi) {
            this.siraNo=siraNo;
            this.uzaklik=uzaklik;
            this.yaricap=yaricap;
            this.donmesuresi=donmesuresi;
        }

        public int getSiraNo(){
            return siraNo;
        }

        public int getUzaklik() {
            return uzaklik;
        }
        public int getYaricap(){
            return yaricap;
        }
        public int getDonmesuresi(){
            return donmesuresi;
        }
    }
}