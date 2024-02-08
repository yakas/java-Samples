package Gun17;

public class _Odev_8 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın

        int toplam=0;
        int[] dizi = {5,6,8,12,14,19};
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0)
                toplam+=dizi[i];
            else
                toplam-=dizi[i];
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]%2==0 ? "+"+dizi[i]:"-"+dizi[i]);
        }
        System.out.println("="+toplam);

    }
}
