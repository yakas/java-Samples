package Gun35._03_Polymorphism_Soru;

import java.util.ArrayList;

public class KimlikMain {
    public static void main(String[] args) {

        ArrayList<Ogrenci> ogrenciler=new ArrayList<>();
        ArrayList<Calisan> calisanlar=new ArrayList<>();

        Ogrenci ogrenci1=new Ogrenci("Yakup","ATALAY","Talebe","8E");
        Ogrenci ogrenci2=new Ogrenci("Zafer","ÇAPIK","Talebe","5A");
        Ogrenci ogrenci3=new Ogrenci("Asli","SENSIN","Talebe","9E");
        Ogrenci ogrenci4=new Ogrenci("Cevdet","KOPTAN","Talebe","8E");
        Ogrenci ogrenci5=new Ogrenci("Merve","ÇEP","Talebe","8E");

        Calisan calisan1=new Calisan("İsmet","OSMANOGLU","Müdür","Yönetim");
        Calisan calisan2=new Calisan("Ilayda","BAKI","Ogretmen","Ogretmenler");
        Calisan calisan3=new Calisan("İhsan","MINIK","Ogretmen","Ogretmenler");
        Calisan calisan4=new Calisan("Kamil","FERROLI","Ogretmen","Ogretmenler");
        Calisan calisan5=new Calisan("Yagiz","LAZUT","Ogretmen","Ogretmenler");
        Calisan calisan6=new Calisan("Alp","KIRSAN","Ogretmen","Ogretmenler");

        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);
        ogrenciler.add(ogrenci3);
        ogrenciler.add(ogrenci4);
        ogrenciler.add(ogrenci5);

        calisanlar.add(calisan1);
        calisanlar.add(calisan2);
        calisanlar.add(calisan3);
        calisanlar.add(calisan4);
        calisanlar.add(calisan5);
        calisanlar.add(calisan6);

        for (Ogrenci ogr:ogrenciler){
            System.out.println(ogr);
        }


        for (Calisan cls:calisanlar){
            System.out.println(cls);
        }
    }
}
