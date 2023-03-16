package string_manipulation;

import java.util.Scanner;

public class terstenYazma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime girin: ");
        String kelime = scanner.next();
        String tersKelime = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }
        System.out.println("Kelimenin tersi: " + tersKelime);
    }
}



