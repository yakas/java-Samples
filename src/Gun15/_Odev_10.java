package Gun15;

public class _Odev_10 {
    public static void main(String[] args) {

        //# 10 -do while loop kullanınız.
        //
        // 0 ile 30 arasındaki bütün çift sayıları yazdırınız.

        int sayi=0;
        do {
            if (sayi % 2==0){
                System.out.println("Çift sayı:"+sayi);
            }
            sayi++;
        }while (sayi<=30);

    }
}
