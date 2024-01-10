package lesson8;

import java.util.HashMap;
public class HashMapOrnek {
    public static void main(String[] args){
        HashMap<String, String> renkler = new HashMap<>();

        renkler.put("R","Kırmızı");
        renkler.put("G","Yeşil");
        renkler.put("B","Mavi");

        String mavi = renkler.get("B");
        System.out.println("B anahtarının karşılığı: "+mavi);
        String yesil = renkler.get("G");
        System.out.println("G anajtarının karşılığı: "+yesil);

        for (String anahtar : renkler.keySet()){
            String deger = renkler.get(anahtar);
            System.out.println(anahtar + "->" + deger);
        }
    }
}
