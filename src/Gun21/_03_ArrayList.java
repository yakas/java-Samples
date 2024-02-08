package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner oku = new Scanner(System.in);
        Scanner okuCevap = new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();

        do {
            System.out.print("Öğrenci notunu giriniz :");
            int not = oku.nextInt();
            notlar.add(not);

            System.out.print("Devam etmek istiyormusunuz (E/H)");
            String cevap = okuCevap.next();
            if (cevap.equalsIgnoreCase("e"))
                continue;
            else
                break;

            }while (true) ;
            int toplam = 0;
            for (int i = 0; i < notlar.size(); i++) {
                toplam += notlar.get(i);

            }
            int ortalam = toplam / notlar.size();
            int ortalamaGecenNotSayisi = 0;
            for (int i = 0; i < notlar.size(); i++) {
                if (notlar.get(i) > ortalam)
                    ortalamaGecenNotSayisi++;


            }
        System.out.println("ortalama = " + ortalam);
            System.out.println("ortalamaGecenNotSayisi = " + ortalamaGecenNotSayisi);



    }
}
