package ders_06;

import java.util.Scanner;

public class methodOlusturma {
    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif sayi isteyin,
        sayının tam kare olup olmadığını
        bulunuz, tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();
        int flag = 0;

        for (int i = 1; i <sayi; i++) {
            if (i*i==sayi){
                flag++;
                System.out.println(i + " true");

                break;
            }
        }if (flag==0){
            System.out.println("false");
        }




 /*
        Metod olusturma asamaları;
        1- public static standart (simdilik)
        2- olusturdugumuz method bize bir sonuc dondurecekse
           dondurecegi sonucun data turunu yaz
         3- method ismi
         4- method parantezi () icine methoda gondermemiz gereken
            bilgileri hangi variable ile gonderecegimizi yaz (parametre)
          5- dondurulmesi istenen islemi yap,
          6- return keyword kullanarak donrulmesi istenen degeri dondur
         */
        /*
        Soru 1- Kullanicidan input olarak verilen bir String,
        baslangic ve bitis indexlerine gore baslangic index'i dahil,
        bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
        - kullanici baslangic degeri olarak,
        bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        -kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.
         */

        String metin = "javaharika";
        indexYazdirma("javaharika",5,9);


        }

public static void indexYazdirma (String metin, int baslangicIndex, int bitisIndex){

        if (baslangicIndex>bitisIndex){
        System.out.println("Hata");
        } else if (metin.length() <baslangicIndex || metin.length()  <bitisIndex) {
        System.out.println("Hata veriyor");

        }else {
        metin= metin.substring(baslangicIndex,bitisIndex);
        System.out.println(metin);

        }




        }


        }
