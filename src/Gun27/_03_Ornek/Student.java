package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders)
    {
        int suAnToplamSaat=0;
        for(Lesson d: dersleri)
            suAnToplamSaat+=d.saat;

        if (suAnToplamSaat+ders.saat <= maxSaat)
           dersleri.add(ders);
        else
            System.out.println(ders.name+": Kredi sınırı aşıldı");
    }

    public void dersleriYazdir()
    {
        System.out.println("\n************ Transkript ************ ");
        System.out.println("Sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d: dersleri)
            System.out.println(d.name+" "+d.saat);
    }


    static void universiteKurallari()
    {
        System.out.println("Kural1 : Kahvaltı yapmadan derse gelme");
        System.out.println("Kural2 : Uykunu mutlaka al, erken yat");
        System.out.println("Kural3 : Herzaman dinç dinamik ol");
        System.out.println("Kural4 : Başta verdiğini kararı UNUTMA!");
        System.out.println("Kural5 : Biz imkansızlıkları, inş aşacağız");
    }



}
