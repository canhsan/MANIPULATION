package string_manipulation;

import java.util.Scanner;

public class ders_02 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre = scan.nextLine();

        int flag = 0;

        if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
            flag++;

        } else {
            System.out.println("Şifrenin ilk harfi küçük olmalıdır");

        }
        char sonharf = sifre.charAt(sifre.length() - 1);

        if (sonharf >= '0' && sonharf <= '9') {
            flag++;

        } else {
            System.out.println("Lütfen son karakteri rakam olarak giriniz");
        }
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemelidir");
        }else {
            flag++;

        }
        if (sifre.length()>=10){
            flag++;

        }else{
            System.out.println("Şifre en az 10 karakter olamldır");

        }
        if (flag==4){
            System.out.println("Şifre başarı ile kaydedilmiştir.");
        }
    }
}