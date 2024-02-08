package Gun15;

public class _Odev_8 {

        public static void main(String[] args) {
            //# _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
            //
            //Sonuç böyle olmalıdır.
            //                 1234*
            //        *        123**
            //      * *        12***
            //    * * *        1****
            //  * * * *        *****
            //* * * * *
            int sayac1 = 4,sayac2 = 1;
            for (int k = 0; k < 5; k++) {
                for (int i = 0; i < sayac1; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < sayac2; j++) {
                    System.out.print("*");
                }
                System.out.println();
                sayac2++;
                sayac1--;

            }
        }

}
