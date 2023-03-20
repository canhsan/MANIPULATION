package ders_06;

import java.util.Scanner;

public class manipülation_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String metin = scan.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1; i >= 0; i--) {
            tersMetin+= metin.charAt(i);

        }System.out.println(tersMetin);
        metin=tersMetin;
        System.out.println(metin);
    }
}
