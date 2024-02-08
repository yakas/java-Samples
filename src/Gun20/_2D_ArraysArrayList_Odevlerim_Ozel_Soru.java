package Gun20;

import java.util.Scanner;

public class _2D_ArraysArrayList_Odevlerim_Ozel_Soru {
    public static void main(String[] args) {
        //Tuş takımından bir P(X,Y) noktasının x ve y koordinatları (tamsayı) olacaktır.
        // Bu nokta,yandaki şekilde gösterilen dikdörtgen içinde ise ekrana" İçinde", dışında ise "Dışında"
        // herhangi bir kenarın üstünde ise "Üstünde" mesajı yazdırılacaktır.
        //X={1,2,3,4,5,6,7,8}
        //Y={1,2,3,4}

        int[][] x = {{-2, -1 , 0 , 1 , 2, 3, 4, 5, 6, 7, 8}, // x ekseni
                      {1,  2 , 3 , 4}          // y ekseni
        };

        Scanner scanKoordinat = new Scanner(System.in);
        System.out.print("X koordinatını 1-8 arası giriniz :");
        int girilenX = scanKoordinat.nextInt();

        System.out.print("Y koordinatını 1-4 arası giriniz :");
        int girilenY = scanKoordinat.nextInt();

        String sonuc=p(girilenX,girilenY,x);
        System.out.println("sonuc = " + sonuc);



    }
    public static String p(int girilenX,int girilenY,int[][] x){
        String sonuc="";

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if(girilenX==x[0][i] || girilenY==x[1][j]){
                    sonuc="Üstünde";
                    break;
                }
                else if ( girilenX<x[0][0] && girilenX>x[0][i] ||  girilenY<x[1][0] && girilenY>x[1][j]) {
                    sonuc="Dışında";
                    break;
                }
                else if ( girilenX>x[0][0] && girilenX<x[0][i] || girilenY>x[1][0] && girilenY<x[1][j]) {
                    sonuc="İçinde";
                    break;
                }
                else continue;
            }
        }
        return sonuc;
    }
}