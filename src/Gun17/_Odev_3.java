package Gun17;

public class _Odev_3 {
    public static void main (String[] args){
        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.
        
        int[] dizi ={25,30,30,35,100};
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        System.out.println("toplam = " + toplam);
    }
}
