package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5; // hafızada sayı saklıyor
        int [] dizi=new int[6]; // hafızada 6 sayı saklar : sabit boyutlu
        int [][] tablo=new int[3][20]; // hafızada 60 sayı saklıyor, 3x20 şeklinde :sabit boyutlu

        // dizi lazım,ama boyutu ekledikçe rtsın, sildik.e azalsın
        ArrayList<Integer> liste=new ArrayList<>(); // tek boyutlu değişken

        ArrayList< ArrayList<Integer>> listelerinListesi = new ArrayList<>(); // 2 boyutlu, 2 boyutuda değişken

        /***************************************************/

        // Java cım, şu ana kadar verdiğin değişken tipleri için teşekkür ederim,
        // fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
        // içine almasın, öyle set ver bana, yani dizi tip ver bana.
        // Java mektubumuza cevap verdi :
        // Sevgili Muhammed hiç canını sıkma , bu iş için tasarlanmış SET ler adını verdiğimiz
        // dizilerimiz var dedi.
        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elamanları tutar.
        // LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.
        // bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi= hs1.add(5);   // true
        boolean tekrarEklendimi=hs1.add(5); // false 5 i eklemedi..
        hs1.add(2); // eklemedi

        System.out.println("Eklendimi :"+eklendiMi);
        System.out.println("Tekrar eklendi mi:"+tekrarEklendimi);
        System.out.println("hs1= "+hs1);






    }
}
