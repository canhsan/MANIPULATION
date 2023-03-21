package ders_06;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {

        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        sayinin asal sayi olup olmadigini
        kontrol edin ve sonucu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        boolean asalMi = true;
        int flag = 0;

        for (int i = 2; i < sayi; i++) {
            flag++;

            if (sayi % i == 0) {

                asalMi= false;
                System.out.println("Bu sayi asal degildir");
                break;
            }
        }
        if (asalMi) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }


    }
}

}
