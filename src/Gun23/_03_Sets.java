package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String > renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // Ekrana yazdırma işlemi
        System.out.println("Renkler :"+renkler);

        //Ekrana tek tek nasıl yazdırırım..bunu foreach ile yazdıryoruz. sol değeri tipi ve bir değişişken : sağı ise hashset dizi adı gelecek
        for (String eleman:renkler) {    // sıra garanti değil.. elemanların hepsi sırası olmadan gelir.
            System.out.println("eleman :"+eleman);

        }
        //int[] dizi={34,5,6,7,8,89,899,77};
        //for (int sayi:dizi) {
        //    System.out.println("sayi = " + sayi);



        Iterator gosterge = renkler.iterator(); // renkler dizisinin iteratoru alındı. yani dizinin ilk kutu // iterator elemanlar hafızaya nasıl yazdı ise onun garantisini veriyor.

        while (gosterge.hasNext())
        {
            System.out.println("gosterge = " + gosterge.next());
            // .Next göstergenin gösterdiği elemanı temsil ediyor.
        }

        HashSet<Integer> sayilar = new HashSet<>();
        sayilar.add(1);
        sayilar.add(5);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println("sayilar = " + sayilar);

        for ( Integer rakam : sayilar  )
            System.out.println("rakam = " + rakam);

        Iterator index = sayilar.iterator();

        while (index.hasNext())
        {
            System.out.println("sayilar = " + index.next());
            System.out.println("index.hasNext() = " + index.hasNext());
        }



    }
}
