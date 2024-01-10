package lesson8;

import java.util.HashMap;

class Ogrenci{
    String ad;
    int yas;
    public Ogrenci(String ad, int yas){
        this.ad= ad;
        this.yas=yas;
    }
}

public class HashMapOzelSinif {
    public static void main (String[] args){
        HashMap<Integer, Ogrenci> ogrenciMap =new HashMap<>();

        ogrenciMap.put(1, new Ogrenci("Ali", 20));
        ogrenciMap.put(2, new Ogrenci("Ayse", 22));
        ogrenciMap.put(3, new Ogrenci("Mehmet", 21));

        Ogrenci ali = ogrenciMap.get(1);
        Ogrenci ayse = ogrenciMap.get(2);
        System.out.println("1 numaralı öğrenci: " + ali.ad + ", " + ali.yas+" yaşında");
        System.out.println("2 numaralı öğrenci: " + ayse.ad + ", " + ayse.yas + " yaşında");

        for (int numara: ogrenciMap.keySet()){
            Ogrenci ogrenci = ogrenciMap.get(numara);
            System.out.println(numara+" -> "+ogrenci.ad+", "+ogrenci.yas+" yaşında");
        }
    }
}
