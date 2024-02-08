package Gun20;
import java.util.Arrays;
import java.util.Scanner;
public class _Methodlar_Odevlerim_4 {
    public static void main(String[] args) {
        // adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java
        Scanner scan = new Scanner(System.in);
        System.out.print("Cumleyi giriniz :");
        String cumle = scan.nextLine();
        reverseWord(cumle);
    }
    public static String reverseWord(String cumle) {
        String tersten = "";
        String[] terstenCumle = cumle.split(" ");

        for (int i = terstenCumle.length - 1; i >= 0; i--) {
            tersten += " " + terstenCumle[i];
        }
        System.out.println("cumle = " + tersten);
        return tersten;
    }

}



