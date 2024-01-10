package lesson8;

import java.util.HashSet;
import java.util.Set;
public class KumeOdevi {
    public static void main (String[] args){
        String[] texts = {"Kume","odev","Deneme","Yazi denemesi","Tekrar eden yazi"};

        for (String text: texts){
            Set<Character> benzersiz = uniquecharacters(text);

            if (benzersiz.size() > 0) {
                System.out.println("Benzersiz karakter kümesi:"+benzersiz);
                break;
            }

        }
    }

    public static Set<Character> uniquecharacters(String text){
        Set<Character> metin = new HashSet<>();
        Set<Character> tekrarlayanmetin = new HashSet<>();

        for (char e : text.toCharArray()){
            if (!metin.add(e)){
                tekrarlayanmetin.add(e);
            }
        }

        if (!tekrarlayanmetin.isEmpty()){
            System.out.println("Tekrar eden karakterler bulundu:"+ tekrarlayanmetin);
            return metin;
        }

        return new HashSet<>();
    }
}
