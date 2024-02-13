package lesson18;

import java.util.Scanner;

public class MaasHesaplama {
    public MaasHesaplama(String departman, String personeladi, int gunsayisi, int gunlukmaas, int mesaigunlimiti, int mesaigunlukmaas) {
    }

    public static void main(String args[]) {
        String departman = "Muhasebe Departmanı";
        String personeladi ="Cemre Avcı";
        System.out.println(departman+" çalışanlarından "+personeladi+" lütfen çalışma gün bilginizi giriniz.");
        Scanner scanner = new Scanner(System.in);
        int gunsayisi = Integer.parseInt(scanner.nextLine());
        //int gunsayisi = 25;
        int gunlukmaas = 1500;
        int maas = gunsayisi * gunlukmaas;

        System.out.println("Toplam maaş bilgisi:");

        if (gunsayisi > 25){
            int mesaigunsayisi = gunsayisi - 25;
            int yenimaas = (25 * gunlukmaas) + (mesaigunsayisi * 1000);
            System.out.println(yenimaas);
        }
        else{
            System.out.println(maas);
        }
    }

    public int hesaplamaMaas() {
        return 0;
    }

}
