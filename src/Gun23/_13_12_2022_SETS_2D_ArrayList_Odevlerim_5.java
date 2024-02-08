package Gun23;

import java.util.ArrayList;

public class _13_12_2022_SETS_2D_ArrayList_Odevlerim_5 {
    public static void main(String[] args) {
        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]

        Integer [][] dizi = { {1,2,3},
                              {4,5,6},
                              {7,8,9}
                            };

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(+dizi[i][j]+"\t");
            }
            System.out.println();
        }
        ArrayList<Integer> yeniArrayList=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                yeniArrayList.add(dizi[i][j]);

            }

        }
        System.out.println("yeniArrayList = " + yeniArrayList);


    }
}
