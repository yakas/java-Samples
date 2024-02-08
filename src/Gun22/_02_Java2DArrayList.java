package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; // tek rakam tutabilen bir değişken
        int[] dizi=new int[20]; // 20 adet değişken saklayabilen bir değişken,uzunluğu sabit
        int[][] tablo = new int[20][2]; // 20 x 2 lik sayı saklayabilen değişken,sabit uzunluklu
        ArrayList<Integer> liste=new ArrayList<>(); // istenildiği kadar sayı eklenebilen ,uzunluğu değişen değişken

        // bir sınıf var bu sınıfta da 20 kişi var ve bunların 3 dersi olsun.
        // Öğrencilerin bu 3 derse ait notlarını nasıl bir değişkende saklayabilirim.

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

        notlarListesi.get(0); // -- > matNotlarini verir
        int matBirNot=notlarListesi.get(0).get(0); // mat notlarının ilkini aldım.
        System.out.println("matBirNot = " + matBirNot);

        System.out.println("notlarListesi = " + notlarListesi.get(0)); // mat notları
        System.out.println("notlarListesi = " + notlarListesi.get(1)); // fiz notları
        System.out.println("notlarListesi = " + notlarListesi.get(2)); // kim notları
        System.out.println();
        System.out.println();


        // yukardakilerin yerine bir for döngisi ile nasıl kullanırız

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi.get ("+i+")" + notlarListesi.get(i));
        }
        System.out.println();
        System.out.println();

        // satır ve sütün yazdırma işlemini nasıl yazarız.

        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {  // notlar.lenght
                System.out.print(notlarListesi.get(i).get(j)+"\t");  // [i][j]
            }
            System.out.println();
        }

    }
}
