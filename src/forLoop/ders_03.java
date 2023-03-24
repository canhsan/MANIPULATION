package forLoop;

public class ders_03 {
    public static void main(String[] args) {
        /*
        Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
                donduren bir method olusturun.


        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        String metin = "Java harika";

        String tersMetin= metniTersCevir(metin);
        System.out.println(tersMetin);
    }

    public static String metniTersCevir(String metin) {

        String tersMetin="";
        int a=metin.length()-1;

        while (a>=0){
            tersMetin+=metin.charAt(a);
            a--;

        }
        return tersMetin;
}}
