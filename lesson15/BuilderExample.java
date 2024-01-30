package lesson15;

public class BuilderExample {
    public static void main (String[] args){
        Muzik muzik = new Muzik("Örnek enstürman")
                .nota(8)
                .build();
        System.out.println("Örnek oluşturulan entürman ve nota bilgisi: "+muzik);
    }
}

class Muzik{
    private String ensturman;
    private int nota;
    Muzik(String ensturman, int nota){
        this.ensturman=ensturman;
        this.nota=nota;
    }
    public Muzik(String örnekenstürman){
    }
    public MuzikBuilder nota(int örneknota){
        return null;
    }
}

class MuzikBuilder{
    private String ensturman;
    private int nota;
    public MuzikBuilder(String ensturman){
        this.ensturman=ensturman;
    }
    public MuzikBuilder nota(int nota){
        this.nota=nota;
        return this;
    }
    public Muzik build(){return new Muzik(ensturman,nota);}
}

