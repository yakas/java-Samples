package Gun20;
import java.util.Arrays;
import java.util.Scanner;

public class _Methodlar_Odevlerim_6 {
    public static void main(String[] args) {
        //6- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi oluşturmak istersin :");
        int diziBoyutu= scan.nextInt();
        int [] dizi = new int[diziBoyutu];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("dizinin "+i+". indexli elemanını giriniz:");
            int sayi= scan.nextInt();
            dizi[i]=sayi;
        }
        reversDizi(dizi);

    }
    public static void reversDizi(int [] dizi){
        System.out.print("Dizinin reverse edilmiş hali :");
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i]);

        }
    }
}
