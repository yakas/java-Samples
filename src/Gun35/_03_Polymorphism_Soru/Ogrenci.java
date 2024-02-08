package Gun35._03_Polymorphism_Soru;

public class Ogrenci {
    /*1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
    2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
    3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
      olacak kimlik belgesi formu oluşturan tek bir metod yazınız.OkulMain */

private String ad;
private String soyad;
private String gorevi;
private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi, String subesi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
        setSubesi(subesi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci : "+ad+" "+soyad+"\n"+
                "Gorevi : "+gorevi+"\n"+
                "Subesi : "+subesi;
    }

    public void KimlikBelgesi(){
        System.out.println("**********************************************");
        System.out.println("*               Kimlik Belgesi               *");
        System.out.println("*                                            *");
        System.out.println("*--------------------------------------------*");
        System.out.println("Ad : "+getAd()+" Soyad : "+getSoyad());
        System.out.println("Gorevi : "+getGorevi());
        System.out.println("Subesi : "+getSubesi());
        System.out.println("**********************************************");


    }

  }