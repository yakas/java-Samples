package Gun35._03_Polymorphism_Soru;

public class Calisan extends Ogrenci{
    private String departmani;

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        setDepartmani(departmani);
    }

    public Calisan(String ad, String soyad, String gorevi, String departmani) {

        super(ad, soyad, gorevi, departmani);
        this.departmani=departmani;

    }

    @Override
    public String toString() {
        return "Calisan : "+super.getAd()+" "+super.getSoyad()+"\n"+
                "Gorevi : "+super.getGorevi()+"\n"+
                "Departmani : "+departmani;
    }

    @Override
    public void KimlikBelgesi() {
        System.out.println("*****************************************************");
        System.out.println("*               Kimlik Belgesi                      *");
        System.out.println("*                                                   *");
        System.out.println("*---------------------------------------------------*");
        System.out.println("Ad : "+getAd()+"      Soyad : "+getSoyad());
        System.out.println("Gorevi : "+getGorevi());
        System.out.println("Departmani : "+getDepartmani());
        System.out.println("*****************************************************");


    }


}
