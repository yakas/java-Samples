package Gun20;

import java.util.ArrayList;

public class _2D_ArraysArrayList_Odevlerim_4 {
    public static void main(String[] args) {
        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        //[
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]

        int [][] dizi ={ { 1, 2, 3 },  { 4, 5, 6 },  { 7, 8, 9 }};
        ArrayList<Integer> yeniDizi=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("{");
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+",");
                yeniDizi.add(dizi[i][j]);
            }
            System.out.print("}");
            System.out.println();
        }
        System.out.print("yeniDizi = " + yeniDizi);

    }
}
