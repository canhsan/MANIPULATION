package forLoop;

import java.util.Scanner;

public class ders_01 {
    public static void main(String[] args) {

        /*
        1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
       // yazdirin.
         */

        //for (int i = 1; i <= 100; i++) {
        //     System.out.print(i+" ");
        //             }

        /*
         Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
         dahil) 7 ila bolunebilen sayilari yazdirin.
         */

        /*Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }*/
        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen başlangış sayısı giriniz");
        int input = scan.nextInt();

        System.out.println("lütfen bitiş sayısı giriniz");
        int output = scan.nextInt();

        int toplam = 0;


        if (input > output) {
            System.out.println("lütfen başlangıç değeri bitiş değerinden küçük olsun");

        } else {
            for (int i = input; i < output; i++) {
                toplam += i;

            }
            System.out.print(toplam);
        }

    }

}








