package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari=new ArrayList<>(); //
        ArrayList<Integer> fizNotlari=new ArrayList<>(); //
        ArrayList<Integer> kimNotlari=new ArrayList<>(); //

        matNotlari.add(50);
        matNotlari.add(78);
        matNotlari.add((80));

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(88);
        kimNotlari.add(98);

        // ArrayList in ArrayList ini nasıl tanımlarım YUKARDAKİLERİN HEPSİNİ TEK BİR LİSTEDE TUTMAK İÇİN
        ArrayList<ArrayList<Integer>>notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
//*********************************************************************************************
        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String > dersIsımleri =new ArrayList<>();
        dersIsımleri.add("Matematik");
        dersIsımleri.add("Fizik");
        dersIsımleri.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.print(dersIsımleri.get(i)+" : ");
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {  // tek tek notlar
                System.out.print(notlarListesi.get(i).get(j)+"\t");

            }
            System.out.println();
        }

//*********************************************************************************************
        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.
        System.out.println();
        System.out.println();
        Scanner oku =new Scanner(System.in);
        System.out.print("Ders No (0-Mat, 1-Fiz, 2-Kim) =");
        int dersNo= oku.nextInt();

        dersNotlariniYazdir(notlarListesi,dersNo);
//*********************************************************************************************
        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

        notOrtalamaGecenSayisi(notlarListesi,dersNo);


    }
    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>>notlarListesi,int dersNo){

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.println("notlarListesi = " + notlarListesi.get(dersNo).get(i)+"\t");

        }

    }

    public static void notOrtalamaGecenSayisi(ArrayList<ArrayList<Integer>>notlarListesi,int dersNo) {
        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam=notlarListesi.get(dersNo).get(i);

        }
        int ort=toplam/notlarListesi.get(dersNo).size();
        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>= ort)
                gecenMik++;
        }
        System.out.println("Ortalama="+ort);
        System.out.println("gecenMik = " + gecenMik);




    }
}
