package Gun15;

public class _Odev_9 {
    public static void main(String[] args) {

        //# 9_Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        //Sonuç böyle olmalıdır;
        //
        //       *
        //      ***
        //     *****
        //    *******
        //   *********

        int sayac1 = 5,sayac2 = 1;
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < sayac1; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < sayac2; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
            sayac2++;
            sayac1--;

        }
    }

}



