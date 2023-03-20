package forLoop;

import java.util.Scanner;

public class derss01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");

            } else {
                System.out.print(i + " ");
            }


        }
    }
}
