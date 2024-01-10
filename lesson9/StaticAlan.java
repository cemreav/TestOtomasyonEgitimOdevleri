package lesson9;

public class StaticAlan {
    public static final double PI=3.14159;

    public static int sayac=0;

    public int instanceSayac=0;

    public StaticAlan(){
        sayac++;
        instanceSayac++;
    }

    public static void main (String[] args){

        System.out.println("PI Sabiti: "+StaticAlan.PI);

        StaticAlan nesne1 = new StaticAlan();
        System.out.println("Sayac Değeri: "+ StaticAlan.sayac);
        System.out.println("Instance Sayaca Değeri: "+ nesne1.instanceSayac);

        StaticAlan nesne2 = new StaticAlan();
        System.out.println("Sayac Değer: "+ StaticAlan.sayac);
        System.out.println("Instance Sayac Değeri: "+nesne2.instanceSayac);
    }
}
