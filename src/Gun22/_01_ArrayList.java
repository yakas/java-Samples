package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);
        System.out.println("rakamlar = " + rakamlar);

        // Sıralama işlemi
        Collections.sort(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        // tersine çevir
        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        // Collections da Min ve Max Bulmak
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));
        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));

        // Bütün elemanlara belirli bir değer atama

        Collections.fill(rakamlar,0);
        System.out.println("rakamlar = " + rakamlar);

        //replaceAll
        Collections.replaceAll(rakamlar,0,5); // 0 ları 5 ile değiştir.
        System.out.println("rakamlar = " + rakamlar);

        // tanımlarken değer atama
        int [] dizi ={1,2,3,4};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<String> strList=new ArrayList<>(Arrays.asList("ahmet","mehmet","yakup"));
        System.out.println("strList = " + strList);


        ArrayList<Integer> liste2 = new ArrayList<>();
        Collections.addAll(liste2,2,3,4,5,6,8,9);
        System.out.println("liste2 = " + liste2);

        //diziyi direk ArrayList e nasıl atarım.
        Integer[] dizi2={2,3,4,5};                  // int sadece sayı saklayan primitive tip. // Integer ise hem sayı saklıyor hemde metodları var.
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);





    }
}
