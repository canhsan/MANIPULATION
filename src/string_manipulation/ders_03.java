package string_manipulation;

import java.util.Scanner;

public class ders_03 {
    public static void main(String[] args) {
       /* Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk, kalanlar kucuk seklinde
        yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lütfen Soy isminizi giriniz");
        String soyisim = scan.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1) +
                    " " + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1));

        } else if (isim.length() < soyisim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1) +
                    " " + soyisim.toUpperCase());

        } else {
            System.out.println(isim.toUpperCase() + " " + soyisim.toLowerCase());
        }

    }


}
