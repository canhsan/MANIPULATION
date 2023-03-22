package ders_06;

import java.util.Scanner;
public class methot_2 {
    public static void main(String[] args) {
}

        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
                Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
                isim bosluk soyisim seklinde bize donduren bir method olusturun
                input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

   Scanner scan = new Scanner(System.in);
    //System.out.println("Lutfen isminizi giriniz");
    String isim= scan.nextLine();
    //System.out.println("Lutfen soyisminizi giriniz");
    String soyisim = scan.nextLine();
    //String sonuc ="";

    //System.out.println(isimSoyisimYazdirma(isim, soyisim));
    //System.out.println(isimSoyisimYazdirma(isim,soyisim));


    public static String isimSoyisimYazdirma(String isim, String soyisim) {
        String sonuc= "";
        //isim= isim.toUpperCase().charAt(0);
        isim= isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim= soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
        sonuc= isim+ " " + soyisim;
        //System.out.println(sonuc);
        return sonuc;

    }


}
