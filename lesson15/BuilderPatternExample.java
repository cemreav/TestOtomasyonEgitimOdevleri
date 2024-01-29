package lesson15;

public class BuilderPatternExample{
    public static void main(String[] args){
        Bilgisayar bilgisayar = new Bilgisayar("Örnek marka")
                .islemci("Örnekİşlemci")
                .ram(16)
                .depolama(512)
                .build();
        System.out.println("Oluşturulan Bilgisayar: "+bilgisayar);
    }
}
class Bilgisayar{
    private String marka;
    private String islemci;
    private int ram;
    private int depolama;

    Bilgisayar(String marka, String islemci, int ram, int depolama){
        this.marka=marka;
        this.islemci=islemci;
        this.ram=ram;
        this.depolama=depolama;
    }

    public Bilgisayar(String örnekMarka) {
    }

    public BilgisayarBuilder islemci(String örnekİşlemci) {
        return null;
    }
}
class BilgisayarBuilder{
    private String marka;
    private String islemci;
    private int ram;
    private int depolama;

    public BilgisayarBuilder(String marka){
        this.marka=marka;
    }
    public BilgisayarBuilder islemci(String islemci){
        this.islemci=islemci;
        return this;
    }
    public BilgisayarBuilder ram (int ram){
        this.ram=ram;
        return this;
    }
    public BilgisayarBuilder depolama(int depolama){
        this.depolama=depolama;
        return this;
    }
    public Bilgisayar build(){
        return new Bilgisayar(marka,islemci,ram,depolama);
    }
}
