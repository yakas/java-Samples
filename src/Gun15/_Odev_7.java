package Gun15;

import java.util.Scanner;
public class _Odev_7
{
    public static void main (String[]args)
    {
        /*7- #  Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.
        _örn:
        _length(uzunluk): 7_
        _width(genişlik): 5_
        _Output:_

        #####
        #####
        #####
        #####
        #####
        #####
        ##### */

        Scanner scan = new Scanner(System.in);
        System.out.print("Uzunluk :");
        int uzunluk=scan.nextInt();
        System.out.print("Genislik :");
        int genislik=scan.nextInt();

        for (int i=1 ; i<=uzunluk ; i++)
        {
            for (int k=1 ; k<=genislik ; k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}


