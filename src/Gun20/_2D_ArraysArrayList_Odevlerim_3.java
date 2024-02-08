package Gun20;

import java.util.ArrayList;
import java.util.Arrays;

public class _2D_ArraysArrayList_Odevlerim_3 {
    public static void main(String[] args) {
        //Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"} ,
        //{"Pittsburgh" ,"ohio","new york","ohio"} ,
        //{"ohio","new york"}]
        //Bütün ohio'ları Florida'yla değiştiriniz.
        //Array'i yazdırınız.

        String [][] dizi={
                {"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}
                };
        for (int i = 0; i < dizi.length; i++) { //satır sayısı
            for (int j = 0; j < dizi[i].length; j++) { // sütun sayısı
                if (dizi[i][j].equals("ohio"))
                    dizi[i][j]="Florida";

            }

        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print("\""+dizi[i][j]+"\""+"\t");

            }
            System.out.println();

        }
    }
}
