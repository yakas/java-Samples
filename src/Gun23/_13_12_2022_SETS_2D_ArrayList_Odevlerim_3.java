package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _13_12_2022_SETS_2D_ArrayList_Odevlerim_3 {
    public static void main(String[] args) {
        //commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //return tipi arraylist olmalı.
        //**ÖRNEĞİN:**
        // İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
        // İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
        //Ortak değerleri ArrayListe ekleyiniz.
        //çıktı:  "Germany" , "Brazil" ,"USA"
        //ArrayListi yazdırınız.

        HashSet<String> hs1 =new HashSet<>(Arrays.asList("Germany","England","South Africa","Brazil","USA"));
        HashSet<String> hs2 =new HashSet<>(Arrays.asList("Germany","China","Brazil","France","USA"));
        System.out.println("hs1 = " + hs1);
        System.out.println("hs2 = " + hs2);
        System.out.println("---------------------------------------------------");

        commonValues(hs1,hs2);

    }
    public static void commonValues(HashSet<String> hs1, HashSet<String> hs2){
        ArrayList<String > ortakDegerler = new ArrayList<>();
        ortakDegerler.addAll(hs1);
        ortakDegerler.retainAll(hs2);
        System.out.println("ortakDegerler = " + ortakDegerler);


    }
}
