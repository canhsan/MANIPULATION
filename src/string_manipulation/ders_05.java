package string_manipulation;

import java.util.Scanner;

public class ders_05 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
         :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
         yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine();
        //int uzunluk=input.length();

        if ((input.length() / 2) % 2 == 0) {
            //int mid=uzunluk/2;
            input = input.substring(0, input.length() / 2) + ":)" + input.substring(input.length() / 2);

        } else {
            //int mid=uzunluk/2;
            input = input.substring(0, input.length() / 2) + ":(" + input.substring(input.length() / 2 + 1);
            System.out.println("sonuç:" + input);
        }
    }
}
